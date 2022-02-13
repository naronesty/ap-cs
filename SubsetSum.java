
/**
 * Writers: Noakai Aronesty, Han Zhang, Christin Lin, Bryan Zhang, Jessica Eng, Alyssa Choi
The Subset-Sum Problem
===============================================================

   Given a set of integers and a target value, determine
   whether it is possible to find a subset of those integers
   whose sum is equal to the specified target.



 Example:
 -------
    Given the set : {-2, 1, 3, 8} and a target value of 7
    the answer is yes since {-2,1,8} adds up to 7.

    Given the same set and a target of 5, then the answer
    is no.


  Compilation instructions.
  $javac -cp .:../stdlib.jar SubSetSum.java

  Execution instructions. 
  $java -cp .:../stdlib.jar SubSetSum arg0 ... argN

Reads the set elements as command-line arguments, takes
the target from standard input.

Sample Runs
$ java -cp .:../stdlib.jar SubsetSum -2 1 3 8
  enter target value: 7
  set: [-2, 1, 3, 8]
  target: 7
  subset exits? true
$ java -cp .:../stdlib.jar SubsetSum -2 1 3 8
  enter target value: 5
  set: [-2, 1, 3, 8]
  target: 5
  subset exits? false
*/

import java.util.TreeSet;

public class SubsetSum{
    public static boolean subsetExists(TreeSet<Integer> set, int target){
        if (set.isEmpty()) return target == 0;
        int first = set.first(); // returns and removes
        TreeSet<Integer> rest = new TreeSet<Integer>(set);
        rest.remove(first);
        return subsetExists(rest,target - first) ||
                subsetExists(rest,target);
    }

    /*public static int subsetSumWays(TreeSet<Integer> set, int target) {

    }*/

    public static void main(String [] args){
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (String s : args)
            set.add(Integer.parseInt(s));
        System.out.print("enter target value: ");
        int target = StdIn.readInt();

        System.out.println("set: " + set);
        System.out.println("target: " + target);
        System.out.println("subset exits? " + subsetExists(set,target));
    }
}