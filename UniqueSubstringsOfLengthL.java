import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac UniqueSubstringsOfLengthL.java
 *  Execution:    java UniqueSubstringsOfLengthL
 ******************************************************************************/

public class UniqueSubstringsOfLengthL {
    public static void main(String[] args) {
        int l = Integer.parseInt(args[0]);
        String line = StdIn.readLine();
        HashSet<String> uniques = new HashSet<>();
        for (int i = 0; i < line.length() - l; i++) {
            String temp = line.substring(i, i + l);
            if (!uniques.contains(temp)) {
                uniques.add(temp);
            }
        }
        System.out.println(uniques.size());
    }
}
