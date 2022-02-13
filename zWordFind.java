/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac GermanWordFind.java
 *  Execution:    java GermanWordFind
 ******************************************************************************/

public class zWordFind {
    public static void main(String[] args) {
        In in = new In("german.dic");
        String letters = "rsaenp";
        Impts.findScrambled(in, letters);
    }
}
