/******************************************************************************
 *  Compilation:  javac ArrayRev.java
 *  Execution:    java ArrayRev
 *
 *  Prints Description of output
 *
 *  % java ArrayRev in
 *  out
 *
 *  % java ArrayRev in
 *  out
 ******************************************************************************/

public class ArrayRev {
    public static void main(String[] args) {
        String[] arr = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }
        for (int j = 0; j < args.length / 2; j++) {
            String temp = arr[j];
            arr [j] = arr[arr.length - j - 1];
            arr [arr.length - j - 1] = temp;
        }
        System.out.print("{");
        for (int k = 0; k < arr.length; k++) {
            if (k < arr.length - 1) System.out.print(arr[k] + ", ");
            else System.out.print(arr[k]);
        }
        System.out.print("}");
    }
}