package Zoo_Stuff;

import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Mammal.java
 *  Execution:    java Mammal
 ******************************************************************************/

public abstract class Mammal extends Animal{
    private boolean hasFur = true;

    public void shave(){
        hasFur = false;
    }

    public void growFur(){
        hasFur = true;
    }

    public void displayFurStatus() {
        String y = "no ";
        if (hasFur) {
            y = "";
        }
        System.out.println("This mammal has " + y + "fur!");
    }

    public void breathe() {
        System.out.println("pant pant!");
    }
}
