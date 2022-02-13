/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac BandMatrix.java
 *  Execution:    java BandMatrix
 *
 *  Takes two integer command-line arguments n and width and prints an n-by-n
 *  pattern, with a zero (0) for each element whose distance from the main
 *  diagonal is strictly more than width, and an asterisk (*) for each entry
 *  that is not, and two spaces between each 0 or *.
 *
 *  % java BandMatrix 8 1
 *  *  *  0  0  0  0  0  0
 *  *  *  *  0  0  0  0  0
 *  0  *  *  *  0  0  0  0
 *  0  0  *  *  *  0  0  0
 *  0  0  0  *  *  *  0  0
 *  0  0  0  0  *  *  *  0
 *  0  0  0  0  0  *  *  *
 *  0  0  0  0  0  0  *  *
 *
 *  % java BandMatrix 5 3
 *  *  *  *  *  0
 *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *
 *  0  *  *  *  *
 ******************************************************************************/

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        String[][] a = new String[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) a[i][j] = "0";
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                if (j - i <= width) {
                    a[i][j] = "*";
                    a[j][i] = "*";
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}