/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac ActivationFunction.java
 *  Execution:    java ActivationFunction
 *
 *  Desciption
 *
 *  % java ActivationFunction in
 *  out
 *
 *  % java ActivationFunction in
 *  out
 ******************************************************************************/

public class ActivationFunction {

    public static double heaviside(double x) {
        if (x < 0) return 0;
        if (x == 0) return 0.5;
        else return 1;
    }

    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    public static double tanh(double x) {
        double a = Math.exp(x);
        double b = Math.exp(-x);
        return(a - b) / (a + b);
    }

    public static double softsign(double x) {
        return x / (1 + Math.abs(x));
    }

    public static double sqnl(double x) {
        if (x <= -2) return -1;
        if (-2 < x && x < 0) {
            return x + ((x * x) / 4);
        }
        if (0 <= x && x < 2) {
            return x - ((x * x) / 4);
        }
        else return 1;
    }

    public static void main(String[] args) {
        System.out.println(heaviside(2));
        System.out.println(sigmoid(2));
        System.out.println(tanh(2));
        System.out.println(softsign(2));
        System.out.println(sqnl(1));
    }
}
