/******************************************************************************
 *  Han Zhang, Alyssa Choi, Bryan Zhang, Noakai Aronesty, Jessica Eng, Christin Lin
 *
 *  Compilation: javac HotPotato.java
 *  Execution: java HotPotato probability
 *
 *  Simulate the Hot Potato Game
 *  ============================
 *  In this game, children form a circle then pass an object
 *  around the circle. As the object is passed from one child to another,
 *  an adult will randomly yell out "HOT POTATO". Upon which the child holding
 *  the object is removed from the circle. The game countinues with the next 
 *  child until there is one child remaining.
 *
 *  Use a Round Robin Scheduler to simulate the child's game Hot Potato.
 *
 *  From the command line, read the probability that "HOT POTATO" is
 *  called.
 *
 ******************************************************************************/
import java.util.*;

public class HotPotato {
  public static void main(String [] args){
    double prob = Double.parseDouble(args[0]);
    Queue<String> queue = new LinkedList<>();
    queue.add("Bobby");
    queue.add("Sue");
    queue.add("Amy");
    queue.add("Mark");
    queue.add("Danny");
    queue.add("Kelly");
    queue.add("Yuki");
    while (queue.size()>1) {
      System.out.print("Children: ");
      System.out.println(queue);
      if (Math.random()<prob) {
        System.out.println("Hot Potato: " + queue.peek());
        queue.remove();
      } else {
        System.out.println("Potato: " + queue.peek());
        queue.add(queue.remove());
      }
    }
    System.out.println("Winner: " + queue.peek());
  }

}

