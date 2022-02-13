/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac aFormat.java
 *  Execution:    java aFormat
 *
 *  Prints description of output
 *
 *  % java aFormat in
 *  out
 *
 *  % java aFormat in
 *  out
 ******************************************************************************/

public class NLines {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(-1, n);
        for (int i = 0; i < n; i++) {
            StdDraw.line(0, n - i, i, 0);
        }
    }
}