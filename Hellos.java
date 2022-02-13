/******************************************************************************
 *  Compilation:  javac Hellos.java
 *  Execution:    java Hellos
 *
 *  Prints A number of "Hello"s equal to the imputted limit parameter with
 *  number suffixes
 *
 *  % java Hellos 2
 *  1st Hello
 *  2nd Hello
 *
 *  % java Hellos 5
 *  1st Hello
 *  2nd Hello
 *  3rd Hello
 *  4th Hello
 *  5th Hello
 ******************************************************************************/

public class Hellos {
    public static void main(String[] args) {
        String input = args[0];
        int limit = Integer.parseInt(input);
        int i = 1;
        while (i <= limit) {
            if (i % 100 - i % 10 == 10) System.out.println(i + "th Hello");
            else if (i % 10 == 1) System.out.println(i + "st Hello");
            else if (i % 10 == 2) System.out.println(i + "nd Hello");
            else if (i % 10 == 3) System.out.println(i + "rd Hello");
            else System.out.println(i + "th Hello");
            i++;
        }

    }
}
