package Zoo_Stuff;

import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Dinosaur.java
 *  Execution:    java Dinosaur
 ******************************************************************************/

public class Dinosaur extends Reptile implements Herbivore{
    public void eatGreens() {
        System.out.println("munch munch!");
    }

    @Override
    public void areReptilesBoring() {
        System.out.println("reptiles nowadays are boring, but dinosaurs sure weren't!");
    }
}
