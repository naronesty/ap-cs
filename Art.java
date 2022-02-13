/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Art.java
 *  Execution:    java Art
 ******************************************************************************/

public class Art {
    public static void genX(double x, double y, double len) {
        double x0 = x - len/2;
        double x1 = x + len/2;
        double y0 = y - len/2;
        double y1 = y + len/2;

        StdDraw.line(x0, y0, x1, y1);
        StdDraw.pause(10);
        StdDraw.line(x0, y1, x1, y0);
        StdDraw.pause(10);
    }

    public static void xTree(int n, double x, double y, double len) {
        if (n == 0) return;
        genX(x, y, len);

        double x0 = x - len/2;
        double x1 = x + len/2;
        double y0 = y - len/2;
        double y1 = y + len/2;

        xTree(n-1, x1, y1, len/2);
        xTree(n-1, x0, y1, len/2);
        xTree(n-1, x0, y0, len/2);
        xTree(n-1, x1, y0, len/2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x = 0.5, y = 0.5;
        double len = 0.5;
        xTree(n, x, y, len);
    }
}