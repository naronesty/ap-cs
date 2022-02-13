/******************************************************************************
 *  Compilation:  javac DiscreteDistribution.java
 *  Execution:    java DiscreteDistribution freq0 freq1 freq2 ... trials
 *
 *  Reads in an array of n frequency counts from the command line,
 *  and prints out i with probability proportional to the ith
 *  frequency count.
 *
 *  % java DiscreteDistribution 1 2 1 10000000
 *  1    2496587    0.2496587
 *  2    5005971    0.5005971
 *  1    2497442    0.2497442
 *
 *
 *  % java DiscreteDistribution 1 1 2 4 100000000
 *  1    12498817    0.12498817
 *  1    12502230    0.1250223
 *  2    24999872    0.24999872
 *  4    49999081    0.49999081
 ******************************************************************************/

public class DiscreteDistribution {
    public static void main(String[] args) {

        // read in frequency of occurrence of n values
        int n = args.length - 1;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[i] = Integer.parseInt(args[i]);
        }

        int trials = Integer.parseInt(args[args.length - 1]);
        int data[] = new int[n];

        for (int j = 0; j < trials; j ++) {
            // compute total count of all frequencies
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += freq[i];
            }

            // generate random integer with probability proportional to frequency
            int r = (int) (total * Math.random());   // integer in [0, total)
            int sum = 0;
            int event = -1;
            for (int i = 0; i < n && sum <= r; i++) {
                sum += freq[i];
                event = i;
            }

            data[event] += 1;
            }
        for (int k = 0; k < n; k++) {
            System.out.print(args[k] + "    " + data[k] + "    " + ((1.0 * data[k]) / (1.0 * trials)));
            System.out.println();
        }
    }
}