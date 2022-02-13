import java.awt.dnd.Autoscroll;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Acronym.java
 *  Execution:    java Acronym
 *
 *  Desciption
 *
 *  % java Acronym in
 *  out
 *
 *  % java Acronym in
 *  out
 ******************************************************************************/

public class Acronym {
    public static String acronym(String str) {
        String replace = str.replace('-', ' ');
        String[] words = replace.split(" ");
        String acron = "";
        for (String i: words) {
            acron += i.substring(0, 1).toUpperCase();
        }
        return acron;
    }

    public static void main(String[] args) {
        System.out.println(acronym("Hello-Good sir"));
    }
}
