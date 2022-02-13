/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac RandomIntSeq.java
 *  Execution:    java RandomIntSeq
 *
 *  Takes two integer command-line arguments m and n and prints n random
 *  integers between 0 and m-1
 *
 *  % java RandomIntSeq 20 10
 *  6 14 17 16 5 8 6 13 8 19
 *
 *  % java RandomIntSeq 1000 15
 *  783 221 237 17 901 469 255 31 608 339 857 905 992 437 387
 ******************************************************************************/

public class RandomIntSeq {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            System.out.print(Impts.randInt(0, m) + " ");
        }
    }
}