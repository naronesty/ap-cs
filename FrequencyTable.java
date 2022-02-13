import java.util.*;
/******************************************************************************
 *  Writers    :    Noakai Aronesty, Bryan Zhang, Christin Lin, Alyssa Choi, Jessica Eng, Han Zhang
 *  Compilation:    javac ScrabbleShooks.java
 *  Execution  :    java ScrabbleShooks
 *  Description:    A program that displays a table showing the number of words that appear in the English lexicon, sorted by lenth of the word.
 ******************************************************************************/
public class FrequencyTable {
  public static void main(String[] args) {
    In file = new In("words.utf-8.txt");
    Map<Integer, Integer> tree = new TreeMap<>();
    Set<Integer> treeset = new TreeSet<>();
    for (String i: file.readAll().split("\n")) {
      int j = i.length();
      if (tree.containsKey(j)) {
        tree.put(j,tree.get(j)+1);
      } else {
        tree.put(j,1);
        treeset.add(j);
      }
    }
    for (int i: treeset) {
      if (tree.get(i)==1) {
        System.out.println("There is 1 word of length " + i + ".");
      } else {
        System.out.println("There are " + tree.get(i) + " words of length " + i + ".");
      }
    }
  }
}