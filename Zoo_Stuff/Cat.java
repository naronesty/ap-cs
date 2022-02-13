package Zoo_Stuff;

import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Cat.java
 *  Execution:    java Cat
 ******************************************************************************/

public class Cat extends Mammal implements Carnivore{
    public void eatMeats() {
        System.out.println("purrrr good mouse!");
    }

    @Override
    public void breathe() {
        System.out.println("purr purr!");
    }
}
