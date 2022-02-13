package Zoo_Stuff;

import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Reptile.java
 *  Execution:    java Reptile
 ******************************************************************************/

public abstract class Reptile extends Animal{
    public void breathe() {
        System.out.println("growl!");
    }

    public void areReptilesBoring() {
        System.out.println("yeah, reptiles are boring!");
    }
}
