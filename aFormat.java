import javax.swing.plaf.basic.BasicListUI;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac aFormat.java
 *  Execution:    java aFormat
 *
 *  Prints description of output
 *
 *  % java aFormat in
 *  out
 *
 *  % java aFormat in
 *  out
 ******************************************************************************/

public class aFormat {
    public int numUniqueValues(List<Integer> l) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i: l) {
            if (!ret.contains(i)) {
                ret.add(i);
            }
        }
        return ret.size();
    }

    public int numInCommon(List<Integer> l1, List<Integer> l2) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i: l1) {
            if (l2.contains(i)) {
                ret.add(i);
            }
        }
        return numUniqueValues(ret);
    }

    public static void rotate(double[] x, double[] y, double theta) {
        for (int i = 0; i < x.length; i++) {
            double distance = Math.sqrt((x[i] * x[i] + y[i] * y[i]));
            double angleOld = Math.toDegrees(Math.atan(y[i] / x[i]));
            double angleNew = angleOld + theta;
            x[i] = Math.cos(Math.toRadians(angleNew)) * distance;
            y[i] = Math.sin(Math.toRadians(angleNew)) * distance;
        }
    }

    public static void banish(int[] a1, int[] a2) {
        for (int i = 0; i < a2.length; i++) {
            if (Impts.intArrToArrList(a1).contains(a2[i])) {
                for (int j = Impts.intArrToArrList(a1).indexOf(a2[i]); j < a1.length; j++) {
                    if (j == a1.length - 1) {
                        a1[j] = 0;
                    }
                    else a1[j] = a1[j + 1];
                }
                i -= 1;
            }
        }
    }

    public static boolean isPermutation(String s1, String s2) {
        ArrayList<String> s1A = Impts.strArrToArrList(s1.split(""));
        ArrayList<String> s2A = Impts.strArrToArrList(s2.split(""));
        Collections.sort(s1A);
        Collections.sort(s2A);
        if (s1A.equals(s2A)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
//        int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
//        int[] a2 = {42, 2222, 9};
//        banish(a1, a2);
//        Impts.printArray(a1);

//        String[] words = new String[]{"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
//        for (String word: words) {
//            if (word.substring(word.length() - 3).equals("ing")) System.out.println(word);
//        }



//        Integer[] arr = new Integer[]{8, 5, 1, 2, 1, 1, 2, 1, 4, 5};
//        LinkedList<Integer> queue = new LinkedList<Integer>(Arrays.asList(arr));
//        Stack<Integer> stack = new Stack<>();
//        for (Integer i: arr) {
//            stack.push(i);
//        }
//        double x[] = { 1};
//        double y[] = { 1};
//        rotate(x, y, 90);
//        Impts.printArray(x);
//        Impts.printArray(y);
//        LightSequence gradShow = new LightSequence("0101 0101 0101");
//        gradShow.display();
//        gradShow.changeSequence("0011 0011 0011 0011");
//        String resultSeq = gradShow.insertSegment("1111 1111", 4);

//        int ind = oldSeq.indexOf(segment);
//        String newSeq = oldSeq.substring(0, ind) + oldSeq.substring(ind + segment.length());
//
//
    }
}