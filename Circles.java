/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Circles.java
 *  Execution:    java Circles
 *
 *  Draws filled circles of random size at random positions in the unit square
 *
 *  % java Circles in
 *  out
 *
 *  % java Circles in
 *  out
 ******************************************************************************/

public class Circles {

    public static void main(String[] args) {
        double numCirc = Double.parseDouble(args[0]);
        double blackProb = Double.parseDouble(args[1]);
        double minRad = Double.parseDouble(args[2]);
        double maxRad = Double.parseDouble(args[3]);

        for (int i = 0; i < numCirc; i++) {
            double x = Math.random();
            double y = Math.random();
            StdDraw.setPenColor(StdDraw.WHITE);
            if (Math.random() / blackProb < 1) {
                StdDraw.setPenColor(StdDraw.BLACK);
            }
            StdDraw.filledCircle(x, y, Math.random() * (maxRad - minRad) + minRad);
        }
    }
}