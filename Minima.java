/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Minima.java
 *  Execution:    java Minima
 *
 *  Takes an integer command-line argument n, generates a random permutation
 *  of the integers from [0,n), prints the permutation, and prints the number
 *  of left-to-right minima in the permuation
 *
 *  % java Minima 3
 *  2 1
 *  left-to-right minima: 1
 *
 *  % java Minima 10
 *  1 7 2 5 8 0 9 3 4
 *  left-to-right minima: 4
 ******************************************************************************/

public class Minima {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] perm = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i;
        }

        int minima = 0;
        for (int i = 1; i < n; i++) {
            System.out.print(perm[i] + " ");
            if (perm[i] < perm[i - 1]) minima ++;
        }
        System.out.println();
        System.out.print("left-to-right minima: " + minima);
    }
}