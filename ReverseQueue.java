/**
 * Write a function
 * <p>
 * public static void reverseQueue(Queue<String> queue)
 * <p>
 * that reverses the elements in the queue. Remember that you have
 * no access to the internal representation of the queue and must
 * therefore come up with an algorithm - presumably involving other
 * structures - that acoomplish this task.
 * <p>
 * Compilation Instructions:
 * $javac ReverseQueue.java
 * <p>
 * Execution Instructions:
 * $ java ReverseQueue arg0 arg1 ...
 * <p>
 * Sample Run
 * $ java ReverseQueue alice ben carol dave eunice
 * queue: [alice, ben, carol, dave, eunice]
 * reversed queue: [eunice, dave, carol, ben, alice]
 **/


import java.util.*;

public class ReverseQueue {

    public static void reverseQueue(Queue<String> queue) {
        Stack<String> stack = new Stack<String>();
        int s = queue.size();
        for (int i = 0; i < s; i++) {
            stack.push(queue.remove());
        }
        for (int i = 0; i < s; i++) {
            queue.add(stack.pop());
        }
    }

    public static void reverseQueueR(Queue<String> queue) {
        if (!queue.isEmpty()) {
            String headString = queue.remove();
            reverseQueueR(queue);
            queue.add(headString);
        }
    }

    public static void main(String[] args) {
        // Declare and create a queue.
        // Either one works
        //Queue <String> queue = new ArrayDeque<String>();
        Queue<String> queue = new LinkedList<String>();

        // Initialize the queue
        queue.addAll(Arrays.asList(args));
        System.out.println(queue.size());

        // Print the results
        System.out.println("queue: " + queue);
        reverseQueueR(queue);
        System.out.println("reversed queue: " + queue);
        reverseQueue(queue);
        System.out.println("queue: " + queue);

    }

}