package Zoo_Stuff;

import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Animal.java
 *  Execution:    java Animal
 ******************************************************************************/

public abstract class Animal {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("My name is: " + name);
    }

    public abstract void breathe();
}
