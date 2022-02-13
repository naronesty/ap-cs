/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac TakagiFunction.java
 *  Execution:    java TakagiFunction
 *
 *  Plot Takagi's function (faulty)
 *
 *  % java TakagiFunction in
 *  out
 *
 *  % java TakagiFunction in
 *  out
 ******************************************************************************/

public class TakagiFunction {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double[] x = new double[n + 1];
        double[] y = new double[n + 1];
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            x[i] = 1.0 * i / n;
            for (int j = 0; j <= k; j++) {
                double plug = Math.pow(2, j) * x[i];
                double s = Math.abs(Math.floor(plug * 0.5) - plug);
                sum += s * (Math.pow(2, -j));
            }
            y[i] = sum;
            sum = 0;
        }
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        for (int i = 0; i < n; i++) {
            StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
        }
    }
}