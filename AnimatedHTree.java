/******************************************************************************
 *  Writers:      Noakai Aronesty, Alyssa Choi Christin Lin, Jishan Chowdhury
 *  Compilation:  javac AnimatedHTree.java
 *  Execution:    java AnimatedHTree
 *
 *  Part d:
 *  When the recursive calls are reordered, the HTree is animated in a
 *  different order. I programmed it so that the tree goes around the four
 *  quadrants 1, 2, 3, 4, but the order of the animation or the quadrants is
 *  determined by the order of the recursive calls.
 *
 *  Additionally, the base case cannot be moved behind any of the recursive
 *  calls. This will trigger a runtime error.
 ******************************************************************************/

public class AnimatedHTree {
    public static void genH(double x, double y, double len) {
        double x0 = x - len/2;
        double x1 = x + len/2;
        double y0 = y - len/2;
        double y1 = y + len/2;

        StdDraw.line(x0, y0, x0, y1);
        StdDraw.pause(10);
        StdDraw.line(x1, y0, x1, y1);
        StdDraw.pause(10);
        StdDraw.line(x0,  y, x1,  y);
        StdDraw.pause(10);
    }

    public static void hTree(int n, double x, double y, double len) {
        if (n == 0) return;
        genH(x, y, len);

        double x0 = x - len/2;
        double x1 = x + len/2;
        double y0 = y - len/2;
        double y1 = y + len/2;

        hTree(n-1, x1, y1, len/2); // 1
        hTree(n-1, x0, y1, len/2); // 2
        hTree(n-1, x0, y0, len/2); // 3
        hTree(n-1, x1, y0, len/2); // 4
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x = 0.5, y = 0.5;
        double len = 0.5;
        hTree(n, x, y, len);
    }
}
