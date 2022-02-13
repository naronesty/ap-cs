/******************************************************************************
 *  Compilation:  javac Distinct.java
 *  Execution:    java Distinct
 *
 *  Prints the number of distinct arguments out of three
 *
 *  % java Distinct 1 1 2
 *  2
 *
 *  % java Distinct 5 9 7
 *  3
 ******************************************************************************/

public class Distinct {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c) System.out.println(1);
        else if (a != b && b != c && a != c) System.out.println(3);
        else System.out.println(2);
    }
}