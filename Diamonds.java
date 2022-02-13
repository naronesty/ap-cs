/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Diamonds.java
 *  Execution:    java Diamonds
 *
 *  Takes a command line input N and plots N nested squares and diamonds
 *
 *  % java Diamonds in
 *  out
 *
 *  % java Diamonds in
 *  out
 ******************************************************************************/

public class Diamonds {

    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        StdDraw.setXscale(-1.1, 1.1);
        StdDraw.setYscale(-1.1, 1.1);

        double count = 1.0;
        for (double i = 0; i < n; i += 1) {
            if (i % 2 == 0) {
                double[] x = {0.0, count, 0.0, -count};
                double[] y = {count, 0.0, -count, 0.0};
                StdDraw.polygon(x, y);
                count /= 2;
            }
        }

        count = 1.0;
        for (double j = 0; j < n; j += 1) {
            if (j % 2 != 0) {
                count /= 2;
                double[] x1 = {-count, count, count, -count};
                double[] y1 = {count, count, -count, -count};
                StdDraw.polygon(x1, y1);
            }
        }
    }
}