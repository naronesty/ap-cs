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

public class Points {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            StdDraw.point(x, y);
        }
    }
}