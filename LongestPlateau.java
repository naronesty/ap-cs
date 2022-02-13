/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac LongestPlateau.java
 *  Execution:    java LongestPlateau
 *
 *  Prints the start and length of the longest plateau in a series of n
 *  command-line argumnets
 *
 *  % java LongestPlateau in
 *  out
 *
 *  % java LongestPlateau in
 *  out
 ******************************************************************************/

public class LongestPlateau {
    public static void main(String[] args) {
        int n = 10;
        int plains[] = new int[n];

        for (int i = 0; i < n; i++) {
            plains[i] = Integer.parseInt(args[i]);
        }

        int start = -1;
        int startTest = -1;
        int length = 0;
        int lengthTest = 0;

        for (int j = 1; j < n; j++) {
            if (plains[j] > plains[j - 1]) {
                startTest = j;
                lengthTest += 1;
            }
            else if (plains[j] == plains[j - 1]) {
                lengthTest += 1;
            }
            else {
                if (lengthTest > length){
                    length = lengthTest;
                    lengthTest = 0;
                    start = startTest;
                    startTest = -1;
                }
            }
        }
        System.out.println("start: " + start);
        System.out.println("length: " + length);
    }
}