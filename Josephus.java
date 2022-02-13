import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Josephus.java
 *  Execution:    java Josephus
 ******************************************************************************/

public class Josephus {
    public static int next(int current, int n) {
        if (current == n - 1) {
            return 0;
        }
        return current + 1;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        System.out.println("members: " + queue);
        int current = n - 1;
        while (queue.size() > 1) {
            for (int i = 0; i < k; i++) {
                current = next(current, queue.size());
            }
            System.out.println("poisoned: " + queue.get(current));
            queue.remove(current);
            current -= 1;
        }
        System.out.println("Survivor: " + queue.remove());
    }
}
