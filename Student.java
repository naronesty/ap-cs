import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Student.java
 *  Execution:    java Student
 ******************************************************************************/

public class Student {
    private String name;
    private int units;
    private int ID;
    public Student(String name, int id) {
        this.name = name;
        ID = id;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public int getUnits() {
        return units;
    }
    public void incrementUnits(int units) {
        this.units += units;
    }
    public boolean hasEnoughUnits() {
        if (units >= 180) {
            return true;
        }
        return false;
    }
    public String toString() {
        return name + " (#" + ID + ")";
    }
}