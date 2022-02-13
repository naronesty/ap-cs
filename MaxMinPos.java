/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac aFormat.java
 *  Execution:    java aFormat
 *
 *  Prints Description of output
 *
 *  % java aFormat in
 *  out
 *
 *  % java aFormat in
 *  out
 ******************************************************************************/

public class MaxMinPos {

    public static void main(String[] args) {
        double min = Integer.MIN_VALUE;
        double max = Integer.MAX_VALUE;
        // read data and compute statistics
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            if (value <= 0) System.out.println("enter a positive");
            else if (value > max) max = value;
            else if (value < min) min = value;
        }
        System.out.println("max :" + max);
        System.out.println("min :" + min);
    }
}