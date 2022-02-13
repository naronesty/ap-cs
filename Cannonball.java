/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Cannonball.java
 *  Execution:    java Cannonball
 ******************************************************************************/

public class Cannonball {

    public static int ballCount(int x) {
        if (x == 0) return 0;
        else return (x * x + ballCount(x - 1));
    }
    public static void main(String[] args) {
        if (ballCount(Integer.parseInt(args[0])) > 0)
            System.out.println(ballCount(Integer.parseInt(args[0])));
        else throw new RuntimeException("Enter a value between 0 and 1860");
    }
}