/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac TenPerLine.java
 *  Execution:    java TenPerLine
 *
 *  Reads from standard input a sequence of integers and prints only the
 *  integers between 0 and 99 back, 10 integers per line, with columns aligned
 *
 *  % java TenPerLine 10 909 101 2 3 4 5 56 7 6 4 3 5 4 4 5 55 5
 *  10      2       3       4       5       56      7       6       4       3
 *  5       4       4       5       55      5       67      34      2       4
 *  5
 *
 *  % java TenPerLine 1 2 3 4 5 6 7 8 9 10 90 91 92 93 94 95 96 97 98 99 100
 *  1       2       3       4       5       6       7       8       9       10
 *  90      91      92      93      94      95      96      97      98      99
 ******************************************************************************/

public class TenPerLine {

    public static void main(String[] args) {
        int count = 0;
        while (!StdIn.isEmpty()) {
            int t = StdIn.readInt();
            if (t >= 0 && t <= 99) {
                System.out.print(t + "\t");
                count++;
                if (count > 0 && count % 10 == 0) {
                    // System.out.print("count = " + count);
                    System.out.println();
                }
            }
        }
    }
}