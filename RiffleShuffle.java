/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac RiffleShuffle.java
 *  Execution:    java RiffleShuffle
 *
 *  Rearranges a deck of n cards using the
 *  Gilbert-Shannon-Reeds model of a "riffle-shuffle."
 *
 *  % java RiffleShuffle in
 *  out
 *
 *  % java RiffleShuffle in
 *  out
 ******************************************************************************/

public class RiffleShuffle {
    public static void riffleShuffle(int[] cards) {
        int n = cards.length;
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (StdRandom.bernoulli()) r++;
        }
        int f = n - r;

        // test
        //System.out.print(r + " ");
        //System.out.println(f);

        int[] pile1 = new int[r];
        for (int i = 0; i < r; i++) {
            pile1[i] = cards[i];
        }

        // test
        //Impts.printArray(pile1);

        int[] pile2 = new int[f];
        for (int i = r; i < n; i++) {
            pile2[i - r] = cards[i];
        }

        // test
        //Impts.printArray(pile2);

        int countCards = 0;
        int countP1 = 0;
        int countP2 = 0;
        while (countCards < n) {
            double n1 = 0;
            double n2 = 0;
            for (int i = 0; i < pile1.length; i++) {
                if (pile1[i] >= 0) n1++;
            }
            for (int i = 0; i < pile2.length; i++) {
                if (pile2[i] >= 0) n2++;
            }

            // test
            //System.out.println("n1 = " + n1);
            //System.out.println("n2 = " + n2);

            if (Math.random() < n1 / (n1 + n2)) {
                cards[countCards] = pile1[pile1.length - (countP1 + 1)];
                pile1[pile1.length - (countP1 + 1)] = -1;
                countCards++;
                countP1++;
            }
            if (Math.random() < n2 / (n1 + n2)) {
                cards[countCards] = pile2[pile2.length - (countP2 + 1)];
                pile2[pile2.length - (countP2 + 1)] = -1;
                countCards++;
                countP2++;
            }
        }
    }

    public static void main(String[] args) {
        int[] x = new int[52];
        for (int i = 0; i < 52; i++)  x[i] = i;
        for (int i = 0; i < 8; i++)
            riffleShuffle(x);
        Impts.printArray(x);
    }
}