package Counters;

import java.util.*;

/******************************************************************************
 *  Writers:      Noakai Aronesty, Vincent Lin, Jishan Chowdhury, Sean Gaines, Christin Lin
 *  Compilation:  javac ModularCounter.java
 *  Execution:    java ModularCounter
 ******************************************************************************/

public class ModularCounter extends IntCounter{
    private int modulus;

    //Constructors
    public ModularCounter(int modulus) {
        if (modulus < 1) {
            throw new IllegalStateException("modulus is bad");
        }
        this.modulus = modulus;
    }
    public ModularCounter(int value, int modulus) {
        super(value);
        if (modulus < 1) {
            throw new IllegalStateException("modulus is bad");
        }
        this.modulus = modulus;
        if (value < 0 || value >= modulus) {
            throw new IllegalStateException("value is bad");
        }
    }

    //Accessors
    public int getModulus() {
        return modulus;
    }

    //Mutators
    @Override
    public void increment() {
        super.increment();
        if (super.getValue() >= modulus) {
            super.reset();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (" + modulus + ")";
    }
}
