package Zoo_Stuff;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Zoo.Zoo.java
 *  Execution:    java Zoo.Zoo
 ******************************************************************************/

public class Zoo {
    public static void aliveTest(Animal animal){
        animal.breathe();
    }

    public static void main(String[] args) {
        System.out.println("NAMES TEST");
        Cat myCat = new Cat();
        Dinosaur dino = new Dinosaur();
        myCat.setName("Bobby");
        dino.setName("Sir Leonitus the Seventeenth");
        myCat.printName();
        dino.printName();
        System.out.println();

        System.out.println("BREATHING TEST");
        aliveTest(myCat);
        aliveTest(dino);
        System.out.println();

        System.out.println("SHAVING TEST");
        myCat.shave();
        myCat.displayFurStatus();
        System.out.println();

        System.out.println("FUR GROWING TEST");
        myCat.growFur();
        myCat.displayFurStatus();
        System.out.println();

        System.out.println("REPTILE BORINGNESS TEST");
        dino.areReptilesBoring();
        System.out.println();

        System.out.println("EATING TEST");
        myCat.eatMeats();
        dino.eatGreens();
    }
}
