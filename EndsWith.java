/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac EndsWith.java
 *  Execution:    java EndsWith
 *
 *  Desciption
 *
 *  % java EndsWith in
 *  out
 *
 *  % java EndsWith in
 *  out
 ******************************************************************************/

public class EndsWith {
    public static boolean endsWith(String n, String suffix) {
        if (n.substring(n.length() - (suffix.length())).equals(suffix)) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(endsWith("I have doopity syndrome", "syndrome"));
    }
}
