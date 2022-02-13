/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac ShannonEntropy.java
 *  Execution:    java ShannonEntropy
 *
 *  Takes a command-line integer m; reads a sequence of integers between 1
 *  and m from standard input; and prints the Shannon entropy to standard
 *  output, with 4 digits after the decimal point.
 *
 *  % echo 1 1 1 1 2 1 2 1 1 2 2 2 2 2 1 2 1 2 2 1 | java ShannonEntropy 2
 *  1.0000
 *
 *  % echo 3 2 6 2 4 3 2 1 2 2 1 3 2 3 2 2 | java ShannonEntropy 6
 *  1.8750
 ******************************************************************************/

import java.util.*;

public class ShannonEntropy {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        List<Integer> inpt = new ArrayList<Integer>();
        while (!StdIn.isEmpty()) {
            int a = StdIn.readInt();
            if (a >= 1 && a <= m)
                inpt.add(a);
        }

        double h = 0;
        for (int i = 0; i < inpt.size(); i++) {
            double p = 0;
            for (int j: inpt) {
                if (j == i) {
                    p++;
                }
            }
            p /= (inpt.size() * 1.0);
            if (p != 0)
                h += -p * (Math.log(p) / Math.log(2.0));

        }
        System.out.printf("%.4f", h);;
    }
}