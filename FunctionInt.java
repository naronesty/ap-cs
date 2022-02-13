/******************************************************************************
 *  Writer:       Noakai Aronesty, Jishan Chowdhury, Sean Gaines, Vincent Lin, Christin Lin
 *  Compilation:  javac FunctionInt.java
 *  Execution:    none
 *
 *  An interface for real-valued functions of one variable.
 *
 ******************************************************************************/

public interface FunctionInt {
    public abstract double evaluate(double x);
    public abstract int evaluate(int x);
}