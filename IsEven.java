import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty, Jishan Chowdhury, Sean Gaines, Vincent Lin, Christin Lin
 *  Compilation:  javac IsEven.java
 *  Execution:    java IsEven
 ******************************************************************************/

public class IsEven implements PredicateFunction{
    public boolean evaluate(int x) {
        return x % 2 == 0;
    }
    public boolean evaluate(double x) {
        return x % 2 == 0;
    }
}
