package Counters;

import java.util.*;

/******************************************************************************
 *  Writers:      Noakai Aronesty, Vincent Lin, Jishan Chowdhury, Sean Gaines, Christin Lin
 *  Compilation:  javac Counter.java
 *  Execution:    java Counter
 ******************************************************************************/

public interface Counter {
    public void reset();
    public void increment();
    public int  getValue();
}