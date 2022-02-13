/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac FibonacciRecursion.java
 *  Execution:    java FibonacciRecursion
 *
 *  Desciption
 *
 *  % java FibonacciRecursion in
 *  out
 *
 *  % java FibonacciRecursion in
 *  out
 ******************************************************************************/

public class FibonacciRecursion {
    public static int getTerm(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            return getTerm(n - 1) + getTerm(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getTerm(9));
    }
}
