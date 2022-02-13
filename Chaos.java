/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Chaos.java
 *  Execution:    java Chaos
 *
 *  Draws a cooler Triforce
 *
 *  % java Chaos 10
 *  Stupid bad
 *
 *  % java Chaos 1000000
 *  Kool gud
 ******************************************************************************/

public class Chaos {

    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenRadius(0.005);

        int trials = Integer.parseInt(args[0]);
        double[] x = {0, 1, 0.5};
        double[] y = {0, 0, Math.sqrt(3.0) / 2};
        int rando = 10;
        double[] point = {0, 0};

        for (int i = 0; i < trials; i ++) {
            if (Impts.randInt(0, 3) == 0) {
                rando = 0;
            }
            else if (Impts.randInt(0, 3) == 1) {
                rando = 1;
            }
            else {
                rando = 2;
            }
            double a = (point[0] + x[rando]) / 2;
            double b = (point[1] + y[rando]) / 2;
            StdDraw.point(a, b);
            point[0] = a;
            point[1] = b;
        }
        StdDraw.show();
    }
}