/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Divisors.java
 *  Execution:    java Divisors
 *
 *  Desciption
 *
 *  % java Divisors in
 *  out
 *
 *  % java Divisors in
 *  out
 ******************************************************************************/
import java.util.*;

public class Divisors {
    public static int gcd(int a, int b) {
        return Impts.max(Impts.getCommon(Impts.divisors(a), Impts.divisors(b)));
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int x = a;
        int y = b;
        int count = 0;
        while (true) {
            if (x == y) return x;
            else if (x < y) x += a;
            else y += b;
        }
    }

    public static boolean areRelativelyPrime(int a, int b) {
        int[] x = Impts.divisors(a);
        int[] y = Impts.divisors(b);
        if (Impts.getCommon(x, y).length > 1) return false;
        return true;
    }

    public static int totient(int n) {
        int numPrime = 0;
        for (int i = 1; i < n; i++) {
            if (areRelativelyPrime(n, i)) numPrime++;
        }
        return numPrime;
    }

    public static void main(String[] args) {
        System.out.println(totient(9));
        System.out.println(lcm(13, 3));
    }
}
