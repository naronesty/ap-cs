/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac CW_31.java
 *  Execution:    java CW_31
 *
 *  Desciption
 *
 *  % java CW_31 in
 *  out
 *
 *  % java CW_31 in
 *  out
 ******************************************************************************/
import java.util.ArrayList;
import java.util.Arrays;

public class CW_31 {
    public static void swap(ArrayList<String> list, int i , int j) {
        list.set(j, list.set(i, list.get(j)));
    }

    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("h", "e", "l", "l", "o"));
        System.out.println(list) ;     // []
        list.add("a");
        swap(list, 1, 2);
        System.out.println(list) ;    // ["a"]
    }
}
