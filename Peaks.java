/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Peaks.java
 *  Execution:    java Peaks
 *
 *  Peaks reads from standard input and then computes and prints the number
 *  of peaks in a terrain, or two-dimentional array of integers.
 *
 *  % java Peaks in
 *  out
 *
 *  % java Peaks in
 *  out
 ******************************************************************************/

public class Peaks {
    public static int[][] terrainBuild() {
        int length = StdIn.readInt();
        int width = StdIn.readInt();
        int terrain[][] = new int[length][width];
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                terrain[i][j] = StdIn.readInt();
            }
        }
        return terrain;
    }

    public static int peaksPrint(int[][] terrain) {
        int peaks = 0;
        for (int i = 1; i < terrain.length - 1; i++) {
            for (int j = 1; j < terrain[i].length - 1; j++) {
                int a = terrain[i][j];
                int b = terrain[i + 1][j];
                int c = terrain[i - 1][j];
                int d = terrain[i][j + 1];
                int e = terrain[i][j - 1];
                if (a > b && a > c && a > d && a > e) {
                    peaks++;
                }
            }
        }
        return peaks;
    }

    public static void main(String[] args) {
        //Impts.printArray2(terrainBuild());
        System.out.print(peaksPrint(terrainBuild()));
    }
}