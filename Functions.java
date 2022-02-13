/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Functions.java
 *  Execution:    java Functions
 *
 *  Prints description of output
 *
 *  % java Functions in
 *  out
 *
 *  % java aFormat in
 *  out
 ******************************************************************************/

public class Functions {
    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static double max3(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static boolean odd(boolean a, boolean b, boolean c) {
        return ((a ^ b) ^ c);
    }

    public static boolean oddVariadic(boolean ... args){
        boolean result = false;
        for (boolean n : args){
            if (n == true) result = !result;
        }
        return result;
    }

    public static int[] createIntegerArray (int ... args){
        int count = 0;
        for (int n : args){
            count++;
        }
        int[] arr = new int[count];
        count = 0;
        for (int n : args){
            arr[count] = n;
            count ++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(max3(1, 2, 3));
        System.out.println(max3(1.2, 2.3, 3.4));
        System.out.println(odd(true, false, true));
        System.out.println(oddVariadic(true, true, false, true, true, false, true, false, true, true));
        Impts.printArray(createIntegerArray(1, 2, 3, 4, 5, 6, 10));

    }
}