/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Galton.java
 *  Execution:    java Galton
 *
 *  Takes command line arguments and forms an array for a Galton Board of
 *  size n, with k marbles. Prints the results in the form of a sideways
 *  Galton board with labeled channels.
 *
 *  % java Galton 5 15
 *  Channel         Marbles
 *  __________________________
 *  0               *
 *  1               * *
 *  2               * * * * *
 *  3               * * * *
 *  4               * * *
 *
 *  % java Galton 10 50
 *  Channel         Marbles
 *  __________________________
 *  0
 *  1
 *  2               * *
 *  3               * * * * * * * * * * *
 *  4               * * * * * * * * * *
 *  5               * * * * * * * * * * * * * * * *
 *  6               * * * * *
 *  7               * * * *
 *  8               * *
 *  9
 ******************************************************************************/

public class Galton {

    public static void main(String[] args) {
        int n  = Integer.parseInt(args[0]);
        int k  = Integer.parseInt(args[1]);
        int galtonBoard[] = new int[n];
        for (int i = 0; i < k; i++) {
            double channel = (1.0 * n - 1) / 2.0;
            for (int j = 0; j < n - 1; j++) {
                if (Impts.randInt(0, 2) == 0) channel += 0.5;
                else channel -= 0.5;
                //System.out.print(channel + "  ");
            }
            //System.out.print("final : " + channel);
            //System.out.println();
            galtonBoard[(int)channel] ++;
        }
        System.out.println("Channel" + "\t\t" + "Marbles");
        System.out.println("__________________________");
        for (int d = 0; d < n; d++) {
            System.out.print(d + "\t\t");
            for (int f = 0; f < galtonBoard[d]; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}