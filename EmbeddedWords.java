import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac EmbeddedWords.java
 *  Execution:    java EmbeddedWords
 ******************************************************************************/

public class EmbeddedWords {
    public static void printWords(In in, String word) {
        String[] wordChars = word.split("");
        while (!in.isEmpty()) {
            String line = in.readLine();
            String[] lineChars = line.split("");
            int linePos = 0;
            for (String i: wordChars) {
                if (linePos == line.length()) {
                    break;
                }
                if (lineChars[linePos].equals(i)) {
                    linePos++;
                }
            }
            if (linePos != line.length()) {
                continue;
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        In in = new In("words.utf-8.txt");
        String word = args[0];
        printWords(in, word);
    }
}
