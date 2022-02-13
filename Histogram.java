import java.security.ProtectionDomain;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Histogram.java
 *  Execution:    java Histogram
 *
 *  Desciption
 *
 *  % java Histogram in
 *  out
 *
 *  % java Histogram in
 *  out
 ******************************************************************************/

public class Histogram {
    public static int[] histogram(int m, int[] a) {
        int[] histogram = new int[m];
        for (int i = 0; i < m; i++) {
            histogram[i] = Impts.countFreq(i, a);
        }
        return histogram;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 2, 2, 3, 4, 5, 5, 5};
        Impts.printArray(histogram(6, x));
    }
}
