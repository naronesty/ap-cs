/******************************************************************************
 *  Compilation:  javac Binary2.java
 *  Execution:    java Binary2
 *
 *  Prints n, a command line argument, in binary
 *
 *  % java Binary2 9
 *  1001
 *
 *  % java Binary2 9999
 *  10011100001111
 ******************************************************************************/

public class Binary2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String ans = "";
        while (n > 0) {
            if (n % 2 == 1) {
                ans = "1" + ans;
            }
            else {
                ans = "0" + ans;
            }
            n /= 2;
        }
        System.out.print (ans);
    }
}