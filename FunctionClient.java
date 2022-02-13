import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty, Jishan Chowdhury, Sean Gaines, Vincent Lin, Christin Lin
 *  Compilation:  javac FunctionClient.java
 *  Execution:    java FunctionClient
 ******************************************************************************/

public class FunctionClient{

    public static List<Integer> map(FunctionInt f, List<Integer> list){
        List<Integer> listo = new ArrayList<Integer>(list);
        for (int i = 0; i < listo.size(); i++) {
            listo.set(i, f.evaluate(list.get(i)));
        }
        return listo;
    }

    public static List<Integer> filter(PredicateFunction f, List<Integer> list){
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (f.evaluate(list.get(i))) {
                ret.add(list.get(i));
            }
        }
        return ret;
    }

    public static void main(String [] args){
        Integer [] array = {3,52,23,5,21,78};
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,array);

        System.out.println(list);   // [3, 52, 23, 5, 21, 78]

        System.out.println(map(new Square(), list)); // [9, 2704, 529, 25, 441, 6084]
        System.out.println(map(new Half(), list)); // [1, 26, 11, 2, 10, 39]
        System.out.println(filter(new IsEven(), list)); // [52, 78]
    }


}
