/******************************************************************************
 *  Name: Diya Rao, Noakai Aronesty
 *  Compilation:  $javac LFSR.java
 *  Execution:    $java LFSR
 *
 *  Description: a program that produces pseudo-random bits by simulating a
 *  linear feedback shift register.
 ******************************************************************************/

public class LFSR {
    private String seed;
    private int tap;

    //CONSTRUCTORS
    public LFSR(String seed, int tap) {
        this.seed = seed;
        this.tap = tap;
    }

    // Accessor
    public int step() {
        if (seed.substring(0, 1).equals(seed.substring(seed.length() - tap - 1, seed.length() - tap))) {
            seed += 0;
        }
        else seed += 1;
        seed = seed.substring(1);
        return Integer.parseInt(seed.substring(seed.length() - 1));
    }

    public int generate(int k) {
        int ret = 0;
        for (int i = 0; i < k; i++) {
            ret = ret * 2 + step();
        }
        return ret;
    }

    @Override
    public String toString() {
        return seed;
    }

    public static void main(String[] args) {
        System.out.println("STEP TEST");
        LFSR lfsr = new LFSR("01101000010", 8);
        for (int i = 0; i < 10; i++) {
            int bit = lfsr.step();
            System.out.println(lfsr + " " + bit);
        }

        System.out.println();
        System.out.println("GENERATE TEST");

        lfsr = new LFSR("01101000010", 8);
        for (int i = 0; i < 10; i++) {
            int r = lfsr.generate(5);
            System.out.println(lfsr + " " + r);
        }
    }
}