/******************************************************************************
 *  Writer:       Noakai Aronesty, Jishan Chowdhury, Sean Gaines, Vincent Lin, Christin Lin
 *  Compilation:  javac Square.java
 *  Execution:    
 *
 *  A function that implements the Function interface.
 *
 ******************************************************************************/

public class Square implements FunctionInt {
    public double evaluate(double x) {
        return x*x;
    }
    public int evaluate(int x) {
        return x*x;
    }
}