/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac aFormat.java
 *  Execution:    java aFormat
 *
 *  Prints description of output
 *
 *  % java aFormat in
 *  out
 *
 *  % java aFormat in
 *  out
 ******************************************************************************/

public class RandomWord {

    public static void main(String[] args) {
        String champ = "";
        int count = 0;
        while(!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;
            if (Math.random() < 1.0 / count)
                champ = word;
        }
        System.out.println("random word = " + champ);
    }
}