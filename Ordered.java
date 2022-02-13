/******************************************************************************
 *  Compilation:  javac Ordered.java
 *  Execution:    java Ordered
 *
 *  Prints true if 3 command line arguments are in either ascending or
 *  descending order.
 *
 *  % java Ordered 1 2 3
 * True
 *
 *  % java Ordered 2 3 1
 * False
 *
 ******************************************************************************/

public class Ordered {
    public static void main(String[] args) {
        System.out.println(findOrdered(args));
    }

    public static boolean findOrdered(String[] args) {
        String x = args[0];
        String y = args[1];
        String z = args[2];
        int f = Integer.parseInt(x);
        int g = Integer.parseInt(y);
        int h = Integer.parseInt(z);
        boolean b;
        if ((f > g && g > h) || (h > g && g > f)) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }
}