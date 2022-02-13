/******************************************************************************
 *  Compilation:  javac Kary.java
 *  Execution:    java Kary
 *
 *  Prints n, a command line argument, in base k
 *
 *  % java Kary 1234 4
 *  103102
 *
 *  % java Kary 9999 15
 *  2E69
 ******************************************************************************/

public class Kary {
    public static void main(String[] args) {

        // read in the command-line argument
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        // set power to the largest power of 2 that is <= n
        int power = 1;
        while (power <= n / k) {
            power *= k;
        }

        // check for presence of powers of 2 in n, from largest to smallest
        while (power > 0) {

            // power is not present in n
            if (n < power) {
                System.out.print(0);
            }

            // power is present in n, so subtract power from n
            else {
                int digit = n / power;
                if (digit == 10) System.out.print("A");
                else if (digit == 11) System.out.print("B");
                else if (digit == 12) System.out.print("C");
                else if (digit == 13) System.out.print("D");
                else if (digit == 14) System.out.print("E");
                else if (digit == 15) System.out.print("F");
                else System.out.print(digit);
                n -= power * digit;
            }

            // next smallest power of 2
            power /= k;
        }

        System.out.println();

    }

}