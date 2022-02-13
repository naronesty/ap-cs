/******************************************************************************
 *  Compilation:  javac Beaufort.java
 *  Execution:    java Beaufort
 *
 *  Prints wind desription according to the Beaufort Scale based on inputted
 *  wind speed (in knots) parameter.
 *
 *  % java Beaufort 8
 *  Gentle Breeze
 *
 *  % java Beaufort 92
 *  Hurricane
 ******************************************************************************/

public class Beaufort {
    public static void main(String[] args) {
        String input = args[0];
        int knots = Integer.parseInt(input);
        switch(knots){ // I think an if statement would be much more appropriate. Switch can't take booleans.
            case 0: case 1:
                System.out.println("Calm");
                break;
            case 2: case 3:
                System.out.println("Light Air");
                break;
            case 4: case 5: case 6:
                System.out.println("Light Breeze");
                break;
            case 7: case 8: case 9: case 10:
                System.out.println("Gentle Breeze");
                break;
            case 11: case 12: case 13: case 14: case 15: case 16:
                System.out.println("Moderate Breeze");
                break;
            case 17: case 18: case 19: case 20: case 21:
                System.out.println("Fresh Breeze");
                break;
            case 22: case 23: case 24: case 25: case 26: case 27:
                System.out.println("Strong Breeze");
                break;
            case 28: case 29: case 30: case 31: case 32: case 33:
                System.out.println("Near Gale");
                break;
            case 34: case 35: case 36: case 37: case 38: case 39: case 40:
                System.out.println("Gale");
                break;
            case 41: case 42: case 43: case 44: case 45: case 46: case 47:
                System.out.println("Strong Gale");
                break;
            case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55:
                System.out.println("Storm");
                break;
            case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63:
                System.out.println("Storm");
                break;
            default:
                System.out.println("Hurricane");
        }
    }
}