/******************************************************************************
 *  Compilation:  javac RGBtoCMYK.java
 *  Execution:    java RGBtoCMYK
 *
 *  Prints Description of output
 *
 *
 *  % java RGBtoCMYK 75 0 130
 *    cyan    = 0.423076923076923
 *    magenta = 1.0
 *    yellow  = 0.0
 *    black   = 0.4901960784313726
 *
 *  % java RGBtoCMYK 85 145 255
 *    cyan    = 0.6666666666666667
 *    magenta = 0.43137254901960786
 *    yellow  = 0.0
 *    black   = 0.0
 ******************************************************************************/

public class RGBtoCMYK {
    public static void main(String[] args) {
        double red = Integer.parseInt(args[0]);
        double green = Integer.parseInt(args[1]);
        double blue = Integer.parseInt(args[2]);
        double cyan, magenta, yellow, white, black;

        white = Math.max(Math.max(red/255, green/255), blue/255);
        cyan  = (white - red/255) / white;
        magenta = (white - green/255) / white;
        yellow = (white - blue/255) / white;
        black = (1 - white);

        System.out.println("cyan    = " + cyan);
        System.out.println("magenta = " + magenta);
        System.out.println("yellow  = " + yellow);
        System.out.println("black   = " + black);
    }
}