import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac HW_33_ArrayListPrac0.java
 *  Execution:    java HW_33_ArrayListPrac0
 *
 *  Description
 *
 ******************************************************************************/

public class HW_33_ArrayListPrac0 {
    public static int countInRange(ArrayList<Integer> list, int min, int max) {
        int countRet = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num >= min && num <= max) {
                countRet++;
            }
        }
        return countRet;
    }

    public static void cumulative(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            list.set(i, list.get(i) + list.get(i - 1));
        }
    }

    public static ArrayList<Integer> indexOfAll(ArrayList<Integer> list0, ArrayList<Integer> list1) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < list0.size() - list1.size() + 1; i++) {
            if (list0.subList(i, i + list1.size()).equals(list1)) {
                ret.add(i);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Integer> list0 = Arrays.asList(1, 6, 1, 2, 1, 4, 1, 2, 1, 2, 1, 8);
        ArrayList<Integer> listo = new ArrayList<Integer>(list0);
        List<Integer> list1 = Arrays.asList(1, 2, 1);
        ArrayList<Integer> lista = new ArrayList<Integer>(list1);

        System.out.println(countInRange(listo, 4, 7));
//        cumulative(listo);
//        System.out.println(listo);
        System.out.println(indexOfAll(listo, lista));
    }
}
