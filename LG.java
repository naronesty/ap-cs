/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac LG.java
 *  Execution:    java LG
 *
 *  Desciption
 *
 *  % java LG in
 *  out
 *
 *  % java LG in
 *  out
 ******************************************************************************/

public class LG {
    public static int lg(int n) {
        int base = 1;
        int count = 0;
        while (true) {
            if (base * 2 > n) return count;
            base *= 2;
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println(lg(16));
    }
}
