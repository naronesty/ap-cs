import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac FindAreaCode.java
 *  Execution:    java FindAreaCode
 ******************************************************************************/

public class FindAreaCode {
    public static HashMap<String, String> getDict() {
        In areas = new In("phone-na.txt");
        areas.readLine();
        String[] areaStr = areas.readAllLines();
        HashMap<String, String> areasHash = new HashMap<>();
        for (String i: areaStr) {
            String[] separ = i.split(",");
            areasHash.put(separ[0], separ[2]);
        }
        return areasHash;
    }

    public static void inputLoop(HashMap<String, String> areasHash) {
        ArrayList<String> keyArr = new ArrayList<String>(areasHash.keySet());
        ArrayList<String> valArr = new ArrayList<String>(areasHash.values());
        while (true) {
            System.out.print("Enter area code or state name: ");
            String input = StdIn.readLine();
            if (input.equals("-1")) break;
            for (int i = 0; i < valArr.size(); i++) {
                if (valArr.get(i).equalsIgnoreCase(input)) {
                    System.out.println(keyArr.get(i));
                }
            }
            for (String i: areasHash.keySet()) {
                if (i.equals(input)) {
                    System.out.println(areasHash.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(getDict());
        inputLoop(getDict());
    }
}
