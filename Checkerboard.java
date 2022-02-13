/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Checkerboard.java
 *  Execution:    java Checkerboard
 *
 *  Takes a command-line argument n and plots an n-by-n checkerboard
 *
 *  % java Checkerboard in
 *  out
 *
 *  % java Checkerboard in
 *  out
 ******************************************************************************/

public class Checkerboard {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        for (double i = 0.5; i < n; i++) {
            for (double j = 0.5; j < n; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.RED);
                else StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(i, j, 0.5);
            }
        }
    }
}