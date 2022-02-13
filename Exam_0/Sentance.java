package Exam_0;

import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Sentance.java
 *  Execution:    java Sentance
 ******************************************************************************/

public class Sentance {
    private String sentance;

    public Sentance(String sent) {
        sentance = sent;
    }

    // a)
    public ArrayList<Integer> getBlankPositions(){
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < sentance.length(); i++) {
            if (sentance.substring(i, i+1).equals(" ")) {
                ret.add(i);
            }
        }
        return ret;
    }

    public int countWords() {
        return getBlankPositions().size() + 1;
    }

    // b)
    public String[] getWords() {
        String[] ret = new String[countWords()];
        int counter = 0;
        for (int i = 0; i < getBlankPositions().size()-1; i++) {
            ret[i] = sentance.substring(counter, getBlankPositions().get(i));
            counter = getBlankPositions().get(i+1);
        }
        return ret;
    }

    public static void main(String[] args) {
        Sentance wow = new Sentance("I love you!");
        Impts.printArray(wow.getWords());
    }
}
