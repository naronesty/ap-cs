/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac GeneralizedHarmonic.java
 *  Execution:    java GeneralizedHarmonic
 *
 *  Takes two integer command-line arguments n and r and uses a for loop to
 *  compute and print the nth generalized harmonic number of order r
 *
 *  % java GeneralizedHarmonic 3 2
 *  1.361111
 *
 *  % java GeneralizedHarmonic 2 2
 *  1.25
 ******************************************************************************/

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        double n = Integer.parseInt(args[0]);
        double r = Integer.parseInt(args[1]);
        double general = 0.0;
        for (double i = 1.0; i <= n; i += 1.0) {
            general += (1.0 / Math.pow(i, r));
        }
        System.out.print(general);
    }
}