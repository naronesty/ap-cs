import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac RaiseToPower.java
 *  Execution:    java RaiseToPower
 ******************************************************************************/

public class RaiseToPower {
    public static double raiseToPower(double x, double n) {
        if (n == 1) {
            return x;
        }
        if (n % 2 != 0) {
            return x * raiseToPower(x, n-1);
        }
        return raiseToPower(x, n/2) * raiseToPower(x, n/2);
    }
    public static void main(String[] args) {
        System.out.println(raiseToPower(2, 3));
    }
}
