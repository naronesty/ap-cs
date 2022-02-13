import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty, Diya Rao
 *  Compilation:  javac RationalClient.java
 *  Execution:    java RationalClient
 ******************************************************************************/

public final class RationalClient {
    public static int factorial(int n) {
        int ret = 1;
        for (int i = 2; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    public static int linearSearch(Rational rats[], Rational key) {
        for (int i = 0; i < rats.length; i++) {
            if (rats[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("CONSTRUCTOR TEST");
        Rational r1 = new Rational(2, 4);
        System.out.println(r1);

        System.out.println("ZERO TEST");
        Rational zTest1 = new Rational();
        Rational zTest2 = new Rational(0, 3);
        Rational zTest3 = new Rational(0);
        Rational zTest4 = new Rational(0, -3);

        System.out.println(zTest1);
        System.out.println(zTest2);
        System.out.println(zTest3);
        System.out.println(zTest4);

        System.out.println("NEGATIVE TEST");
        Rational r2 = new Rational(5, -2);
        System.out.println(r2);

        System.out.println("QUESTION 12 OPERATIONS");
        Rational a = new Rational(2, 5);
        Rational b = new Rational(3, 7);
        Rational c = new Rational(1, 2);
        Rational d = new Rational(7, 11);
        System.out.println(a.plus(b).plus(c).plus(d));
        System.out.println(a.times(b.plus(c)).minus(d));
        System.out.println((a.plus(b)).dividesBy(c.plus(d)));

        System.out.println("QUESTION 13 ARRAYLIST ADDITION");
        Rational[] rato = {a, b, c, d};
        ArrayList<Rational> rats = new ArrayList<>();
        rats.addAll(Arrays.asList(rato));
        Rational sum = new Rational();
        for (Rational i: rats) {
            sum = sum.plus(i);
        }
        System.out.println(sum);

        System.out.println("QUESTION 14 ACCESSORS TEST");
        Rational r3 = new Rational(-1, 2);
        System.out.println(r3.invert());
        System.out.println(r3.negate());
        System.out.println(r3.abs());
        System.out.println(r3.doubleValue());

        System.out.println("QUESTION 15 TAYLOR SERIES e");
        Rational e = new Rational();
        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                System.out.printf("%-20s", (i + "  " + e));
            }
            else {
                System.out.printf("%-18s", (i + "\t" + e));
            }
            System.out.println(e.doubleValue());
            Rational stage = new Rational(1 , factorial(i));
            e = e.plus(stage);
        }

        System.out.println("QUESTION 17 LINEAR SEARCH");
        Rational[] ratsu = {a, b, c, d};
        System.out.println(linearSearch(ratsu, r1));

        System.out.println("QUESTION 18 EQUALS TEST");
        System.out.println(rats.contains(c));
    }
}
