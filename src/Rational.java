import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty, Diya Rao
 *  Compilation:  javac Rational.java
 *  Execution:    java Rational
 *
 *  Description: It's a cool class that does some kewl stuff like multiplying things
 ******************************************************************************/

public final class Rational {
    private int numerator, denominator;

    // Constructors
    public Rational() {
        numerator = 0;
        denominator = 1;
    }
    public Rational(int n) {
        numerator = n;
        denominator = 1;
    }
    public Rational(int n, int d) {
        if (n == 0) {
            numerator = 0;
            denominator = 1;
        }
        else {
            boolean isneg = false;
            if (d < 0 || n < 0) {
                isneg = true;
                if (d < 0 && n < 0) {
                    isneg = false;
                }
                d = Math.abs(d);
                n = Math.abs(n);
            }
            int a = n / Impts.gcd(n, d);
            int b = d / Impts.gcd(n, d);

            if (isneg) {
                numerator = -a;
                denominator = b;
            }
            else {
                numerator = a;
                denominator = b;
            }
        }
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object rhs) {
        if (rhs instanceof Rational){
            Rational r = (Rational) rhs;
            return numerator == ((Rational) rhs).numerator && denominator == ((Rational) rhs).denominator;
        }
        return false;
    }

    // Operators
    public Rational plus(Rational rhs) {
        int lcm = Impts.lcm(denominator, rhs.denominator);
        int n1 = numerator * (lcm / denominator);
        int n2 = rhs.numerator * (lcm / rhs.denominator);
        int res = n1 + n2;
        return new Rational(res, lcm);
    }
    public Rational minus(Rational rhs) {
        int lcm = Impts.lcm(denominator, rhs.denominator);
        int n1 = numerator * (lcm / denominator);
        int n2 = rhs.numerator * (lcm / rhs.denominator);
        int res = n1 - n2;
        return new Rational(res, lcm);
    }
    public Rational times(Rational rhs) {
        int n = numerator * rhs.numerator;
        int d = denominator * rhs.denominator;
        return new Rational(n, d);
    }
    public Rational dividesBy(Rational rhs) {
        int n = numerator * rhs.denominator;
        int d = denominator * rhs.numerator;
        return new Rational(n, d);
    }

    // Accessors
    public Rational invert() {
        Rational r = new Rational(denominator, numerator);
        return r;
    }
    public Rational negate() {
        Rational r = new Rational(-numerator, denominator);
        return r;
    }
    public Rational abs() {
        Rational r = new Rational(Math.abs(numerator), denominator);
        return r;
    }
    public double doubleValue() {
        double n = (double) numerator / denominator;
        return n;
    }
}
