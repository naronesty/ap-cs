/******************************************************************************
 *  Group Members: Noakai Aronesty, Grace Jin, Daniel Chow
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker n
 *
 *  Takes a integer command-line argument, n, and simulates the motion of a random walker
 *  for n steps. After each step, print the location of the random walker.
 *  The lamp post is the origin (0,0). Also print the square of the final distance from the origin.
 *
 *   % java RandomWalker 10
 *   (0, -1)
 *   (0, 0)
 *   (0, 1)
 *   (0, 2)
 *   (-1, 2)
 *   (-2, 2)
 *   (-2, 1)
 *   (-1, 1)
 *   (-2, 1)
 *   (-3, 1)
 *   squared distance = 10
 *
 *   % java RandomWalker 20
 *   (0, 1)
 *   (-1, 1)
 *   (-1, 2)
 *   (0, 2)
 *   (1, 2)
 *   (1, 3)
 *   (0, 3)
 *   (-1, 3)
 *   (-2, 3)
 *   (-3, 3)
 *   (-3, 2)
 *   (-4, 2)
 *   (-4, 1)
 *   (-3, 1)
 *   (-3, 0)
 *   (-4, 0)
 *   (-4, -1)
 *   (-3, -1)
 *   (-3, -2)
 *   (-3, -3)
 *   squared distance = 18
 ******************************************************************************/


public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.25) x += 1;
            else if (Math.random() < 0.5) x -= 1;
            else if (Math.random() < 0.75) y += 1;
            else if (Math.random() < 1) y -= 1;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.print(x * x + y * y);
    }
}