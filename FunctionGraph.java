/******************************************************************************
 *  Compilation:  javac FunctionGraph.java
 *  Execution:    java FunctionGraph a b
 *  Dependencies: StdStats.java
 *  
 *  Plots the function f in the interval [a, b].
 *
 *  % java FunctionGraph -4 4
 *
 ******************************************************************************/

public class FunctionGraph {


    // plots the function f in the interval [a, b] using n+1 evenly spaced points
    public static void plot(Function f, double a, double b, int n) {
        double[] y = new double[n+1];
        double delta = (b - a) / n;
        for (int i = 0; i <= n; i++)
            y[i] = f.evaluate(a + delta*i);
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    // sample client program
    public static void main(String[] args) { 
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        int m = Integer.parseInt(args[2]);
        StdDraw.setXscale(a, b);
        StdDraw.setYscale(0, 600);
        Function f = (x) -> {return 300;};
        StdDraw.setPenColor(StdDraw.BLUE);
        plot(f, a, b, m);
        f = (x) -> { return Math.log(x);};
        StdDraw.setPenColor(StdDraw.YELLOW);
        plot(f, a, b, m);
        f = (x) -> {return x;};
        StdDraw.setPenColor(StdDraw.GREEN);
        plot(f, a, b, m);
        f = (x) -> {return x * Math.log(x);};
        StdDraw.setPenColor(StdDraw.PINK);
        plot(f, a, b, m);
        f = (x) -> {return x * x;};
        StdDraw.setPenColor(StdDraw.GRAY);
        plot(f, a, b, m);
        f = (x) -> {return Math.pow(2, x);};
        StdDraw.setPenColor(StdDraw.RED);
        plot(f, a, b, m);
    }
}
