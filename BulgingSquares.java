/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac BulgingSquares.java
 *  Execution:    java BulgingSquares
 *
 *  Draws an optical illusion from Akiyoshi Kitaoka. The center appears to
 *  bulge outwards even though all squares are the same size.
 *
 *  % java BulgingSquares in
 *  out
 *
 *  % java BulgingSquares in
 *  out
 ******************************************************************************/

public class BulgingSquares {

    public static void main(String[] args) {
        int n = 15;
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        for (double i = 0.5; i < n; i++) {
            for (double j = 0.5; j < n; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.BLACK);
                else StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(i, j, 0.5);
            }
        }

        for (double k = 1; k < n - 1; k++) {
            for (double l = 1; l < n - 1; l++) {
                if ((k + l) % 2 == 0) StdDraw.setPenColor(StdDraw.WHITE);
                else StdDraw.setPenColor(StdDraw.BLACK);

                if (k < 7 && l < 7 && k + l > 5 && !(k + l == 6 && (k == 1 || k == 5))) {
                    StdDraw.filledSquare(k + 0.83, l + 0.17, 0.15);
                    StdDraw.filledSquare(k + 0.17, l + 0.83, 0.15);
                }

                if (k > 7 && l < 7 && k - l < 9 && !(k - l == 8 && (l == 1 || l == 5))) {
                    StdDraw.filledSquare(k + 0.17, l + 0.17, 0.15);
                    StdDraw.filledSquare(k + 0.83, l + 0.83, 0.15);
                }

                if (k < 7 && l > 7 && l - k < 9 && !(l - k == 8 && (k == 1 || k == 5))) {
                    StdDraw.filledSquare(k + 0.17, l + 0.17, 0.15);
                    StdDraw.filledSquare(k + 0.83, l + 0.83, 0.15);
                }

                if (k > 7 && l > 7 && k + l < 23 && !(k + l == 22 && (k == 9 || k == 13))) {
                    StdDraw.filledSquare(k + 0.83, l + 0.17, 0.15);
                    StdDraw.filledSquare(k + 0.17, l + 0.83, 0.15);
                }

                if (k == 7 && l < 7) {
                    StdDraw.filledSquare(k + 0.17, l + 0.83, 0.15);
                    StdDraw.filledSquare(k + 0.83, l + 0.83, 0.15);
                }

                if (k == 7 && l > 7) {
                    StdDraw.filledSquare(k + 0.83, l + 0.17, 0.15);
                    StdDraw.filledSquare(k + 0.17, l + 0.17, 0.15);
                }

                if (k > 7 && l == 7) {
                    StdDraw.filledSquare(k + 0.17, l + 0.83, 0.15);
                    StdDraw.filledSquare(k + 0.17, l + 0.17, 0.15);
                }

                if (k < 7 && l == 7) {
                    StdDraw.filledSquare(k + 0.83, l + 0.17, 0.15);
                    StdDraw.filledSquare(k + 0.83, l + 0.83, 0.15);
                }
            }
        }
    }
}