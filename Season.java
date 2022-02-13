/******************************************************************************
 *  Compilation:  javac Season.java
 *  Execution:    java Season
 *
 *  Prints Description of output
 *
 *  % java Season in
 *  out
 *
 *  % java Season in
 *  out
 ******************************************************************************/

public class Season {
    public static void main(String[] args) {
        String inputM = args[0];
        String inputD = args[1];
        int m = Integer.parseInt(inputM);
        int d = Integer.parseInt(inputD);
        if (m == 1) System.out.println("Winter");
        else if (m == 2) System.out.println("Winter");
        else if (m == 3) {
            if (d < 21) System.out.println("Winter");
            else System.out.println("Spring");
        }
        else if (m == 4) System.out.println("Spring");
        else if (m == 5) System.out.println("Spring");
        else if (m == 6) {
            if (d < 21) System.out.println("Spring");
            else System.out.println("Summer");
        }
        else if (m == 7) System.out.println("Summer");
        else if (m == 8) System.out.println("Summer");
        else if (m == 9) {
            if (d < 23) System.out.println("Summer");
            else System.out.println("Fall");
        }
        else if (m == 10) System.out.println("Fall");
        else if (m == 11) System.out.println("Fall");
        else if (m == 12) {
            if (d < 21) System.out.println("Fall");
            else System.out.println("Winter");
        }
        else System.out.println("Please input a month value from 1 and 12");
    }
}