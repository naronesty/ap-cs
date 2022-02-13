package Counters;

import java.util.*;

/******************************************************************************
 *  Writers:      Noakai Aronesty, Vincent Lin, Jishan Chowdhury, Sean Gaines, Christin Lin
 *  Compilation:  javac IntCounter.java
 *  Execution:    java IntCounter
 ******************************************************************************/

public class IntCounter implements Counter{
    private int value;

    // Constructors
    public IntCounter(){
        value = 0;
    }
    public IntCounter(int initValue) {
        value = initValue;
    }

    //Accessors
    public int getValue() {
        return value;
    }

    //Mutators
    public void reset() {
        value = 0;
    }
    public void increment() {
        value++;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
