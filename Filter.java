/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Filter.java
 *  Execution:    java Filter
 *
 *  Filter that reads in a sequence of integers from standard
 *  input and prints the integers to standard output, removing repeated
 *  values that appear consecutively.
 *
 *  % java Filter 1 2 2 1 5 1 7 7 7 7 1 1 1 1 1 1 1 1 1
 *  1 2 1 5 1 7 1
 ******************************************************************************/

public class Filter {

    public static void main(String[] args) {
        int z = Integer.MAX_VALUE;
        while (!StdIn.isEmpty()) {
            int t = StdIn.readInt();
            if (z != t) {
                System.out.print(t + " ");
            }
            z = t;
        }
        System.out.println();
    }
}