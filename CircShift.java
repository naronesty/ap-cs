/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac CircShift.java
 *  Execution:    java CircShift
 *
 *  Desciption
 *
 *  % java CircShift in
 *  out
 *
 *  % java CircShift in
 *  out
 ******************************************************************************/

public class CircShift {
    public static boolean isShifted(String s1, String s2) {
        return (s2 + s2).contains(s1) && s1.length() == s2.length();
    }

    public static String baseSplit(String n) {
        return n.split("\\.")[1];
    }

    public static String topLevelThing(String n) {
        return n.split("\\.")[n.length() - 1];
    }

    public static String domainReverse(String n) {
        String[] x = Impts.reverseArray(n.split("\\."));
        return String.join(".", x);
    }

    public static void main(String[] args) {
        System.out.println(isShifted("abcd", "dabc"));
        System.out.println(domainReverse("hola.ninja.wuzza"));
    }
}
