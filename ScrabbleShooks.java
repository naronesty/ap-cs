import java.util.*;
/******************************************************************************
 *  Writers    :    Noakai Aronesty, Bryan Zhang, Christin Lin, Alyssa Choi, Jessica Eng, Han Zhang
 *  Compilation:    javac ScrabbleShooks.java
 *  Execution  :    java ScrabbleShooks
 *  Description:    A program that uses the Scrabble dictionary to make a list of all words that that allow S-hooks on either end.
 ******************************************************************************/
public class ScrabbleShooks {
  public static void main(String[] args) {
    List<String> arr = new ArrayList<>();
    Set<String> hash = new HashSet<>();
    In file = new In("ospd.txt");
    for (String i: file.readAll().split("\n")) {
      hash.add(i);
    }
    for (String i: hash) {
      if (hash.contains("s"+i)&&hash.contains(i+"s")) {
        arr.add(i);
      }
    }
    System.out.println(arr);
  }
}