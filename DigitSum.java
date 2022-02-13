/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac DigitSum.java
 *  Execution:    java DigitSum
 *
 *  Desciption
 *
 *  % java DigitSum in
 *  out
 *
 *  % java DigitSum in
 *  out
 ******************************************************************************/

public class DigitSum {
    public static int digitSum(int n) {
        int sum = 0;
        if (n == 0) return 0;
        else {
            return n % 10 + digitSum(n / 10);
        }
    }

    public static int digitalRoot(int n) {
        int root = 0;
        if (n / 10 == 0) return n;
        else {
            return digitalRoot(digitSum(n));
        }
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(Integer.parseInt(args[0])));
    }
}
