/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac SpaceNumber.java
 *  Execution:    java SpaceNumber
 *
 *  Desciption
 *
 *  % java SpaceNumber in
 *  out
 *
 *  % java SpaceNumber in
 *  out
 ******************************************************************************/

public class SpaceNumber {
    public static int countSpaces(String n) {
        return (n + "n").split(" ").length - 1;
    }

    public static void main(String[] args) {
        System.out.println(countSpaces("     hi my name is fred    "));
    }
}
