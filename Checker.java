/******************************************************************************
 *  Group Members: Noakai Aronesty, Grace Jin, Daniel Chow
 *  Compilation:  javac Checker.java
 *  Execution:    java Checkerboard n k
 *
 *  Takes a integer command-line argument, N, and uses two nested for loops   to print
 *  an N-by-N "checkerboard" pattern with a total of NxN asterisks.
 *  Each row has 2N characters (alternating between asterisks and spaces).
 *
 *  % Checkerboard 4
 *  * * * *
 *  * * * *
 *  * * * *
 *  * * * *
 *
 *  % Checkerboard 5
 *  * * * * *
 *  * * * * *
 *  * * * * *
 *  * * * * *
 *  * * * * *
 *
 ******************************************************************************/

public class Checker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}