import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac CW_32.java
 *  Execution:    java CW_32
 *
 *  Desciption
 *
 *  % java CW_32 in
 *  out
 *
 *  % java CW_32 in
 *  out
 ******************************************************************************/

public class CW_32 {
    public static void addStars(ArrayList<String> list) {
        for (int i = 0; i < list.size() + 1; i += 2) {
            list.add(i, "*");
        }
    }

    public static ArrayList<String> mirror(ArrayList<String> list) {
        ArrayList<String> ret = list;
        Impts.reverseList(list);
        ret.addAll(list);
        return ret;
    }

    public static void main(String[] args) {
        List<String> list0 = Arrays.asList("The", "Fox", "Had", "The", "Bad");
        ArrayList<String> listo = new ArrayList<String>(list0);
        addStars(listo);
        System.out.println(listo);
        System.out.println(mirror(listo));
        System.out.println(listo);
    }
}
