package Counters;

import java.util.*;

/******************************************************************************
 *  Writers:      Noakai Aronesty, Vincent Lin, Jishan Chowdhury, Sean Gaines, Christin Lin
 *  Compilation:  javac BoundedCounter.java
 *  Execution:    java BoundedCounter
 ******************************************************************************/

public class BoundedCounter extends IntCounter{
    private int bound;

    //Constructors
    public BoundedCounter(int bound) {
        if (bound < 0) {
            throw new IllegalStateException("bound is bad");
        }
        this.bound = bound;
    }
    public BoundedCounter(int value, int bound) {
        super(value);
        if (bound < 0) {
            throw new IllegalStateException("bound is bad");
        }
        this.bound = bound;
        if (value > bound) {
            throw new IllegalStateException("value is bad");
        }
    }

    //Accessors
    public int getBound() {
        return bound;
    }

    @Override
    public void increment() {
        if (super.getValue() < bound) {
            super.increment();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[bounded by " + bound + "]";
    }
}
