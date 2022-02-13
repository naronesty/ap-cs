/******************************************************************************
 *  Compilation:  javac TriangleProbability.java
 *  Execution:    java TriangleProbability
 *
 *  Prints an estimation of the probablity that three random values between 0
 *  and 1 are possible side lengths of a triangle
 *
 *  % java TriangleProbability
 *  0.513
 *
 *  % java TriangleProbability
 *  0.498
 ******************************************************************************/

public class TriangleProbability {
    public static void main(String[] args) {
        double prob = 0;
        for (int i = 0; i < 1000; i++) {
            double a = Math.random();
            double b = Math.random();
            double c = Math.random();
            if (a != 0 && b != 0 && c != 0 && (a + b <= c || a + c <= b || b + c <= a)) {
                prob++;
            }
        }
        System.out.println(prob / 1000);
    }
}