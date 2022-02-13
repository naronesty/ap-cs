/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Sqrt.java
 *  Execution:    java Sqrt
 *
 *  Prints the sqare root of a command line argument using the sqrt function
 *
 *  % java Sqrt 9
 *  3.0
 *
 *  % java Sqrt 17
 *  4.123105625617661
 ******************************************************************************/

public class Sqrt {
    public static double sqrt(double x) {
        double g = x / 2;
        while (!((g + x / g) / 2 == g) && !((g + x / g) / 2 == x / g)) {
            g = ((g + x / g) / 2);

        }
        return g;
    }
    public static void main(String[] args) {
        StdOut.print(sqrt(Double.parseDouble(args[0])));
    }
}