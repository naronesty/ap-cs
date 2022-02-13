/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac AudioCollage.java
 *  Execution:    java AudioCollege
 *
 *  Desciption
 *
 *  % java AudioCollege in
 *  out
 *
 *  % java AudioCollege in
 *  out
 ******************************************************************************/

public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] amp = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            amp[i] = a[i] * alpha;
        }
        return amp;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        return Impts.reverseArray(a);
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        return Impts.append(a, b);
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] x = b.clone();
        double[] y = a.clone();
        if (a.length > b.length) {
            x = a.clone();
            y = b.clone();
        }

        for (int i = 0; i < y.length; i++) {
            x[i] += y[i];
        }
        return x;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] changed = new double[(int) (a.length / alpha)];
        for (int i = 0; i < changed.length; i++) {
            changed[i] = a[(int) (i * alpha)];
        }
        return changed;
    }

    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4, 5};
        double[] b = {1, 2, 3, 4};
        Impts.printArray(changeSpeed(a, 1));
    }
}
