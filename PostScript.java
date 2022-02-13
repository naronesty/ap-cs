import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac PostScript.java
 *  Execution:    java PostScript
 ******************************************************************************/

public class PostScript {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        Stack<String> s = new Stack<String>();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println("Initial : " + s);
        roll(s, n, k);
        System.out.println("after roll(" + n + ", " + k + "): " + s);
    }

    public static void roll(Stack<String> stack, int n, int k) {
        ArrayList<String> rolled = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            rolled.add(stack.pop());
        }
        Collections.rotate(rolled, -k);
        for (int i = 0; i < rolled.size(); i++) {
            stack.push(rolled.get(rolled.size()-i-1));
        }
    }
}
