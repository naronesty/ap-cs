/******************************************************************************
 *  Compilation:  javac Name.java
 *  Execution:    java Name
 *
 *  Prints Description of output
 *
 *  % java Name in
 *  out
 *
 *  % java Name in
 *  out
 ******************************************************************************/

public class PowersOfTwo {
    public static void main(String[] args) {

        // read in one command-line argument
        int n = Integer.parseInt(args[0]);

        int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        System.out.println("n\ti\tpowerOfTwo\ti<=n\toutput");
        System.out.println("-------------------------------------------------");
        // repeat until i equals n
        while (i <= n) {
            boolean b = i <= n;
            System.out.println(n + "\t" + i + "\t" + powerOfTwo + "\t\t" + b + "\t" + i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }

    }
}