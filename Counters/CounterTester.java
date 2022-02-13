package Counters;
/**
 Writers:                  Noakai Aronesty, Vincent Lin, Jishan Chowdhury, Sean Gaines, Christin Lin
 Compilation Instructions: $ javac CounterTester.java
 Execution instructions:   $ java  CounterTester


 counters: [0, 0 (5), 0[bounded by 7]]
 increment the counters
 counters: [1, 1 (5), 1[bounded by 7]]
 counters: [2, 2 (5), 2[bounded by 7]]
 counters: [3, 3 (5), 3[bounded by 7]]
 counters: [4, 4 (5), 4[bounded by 7]]
 counters: [5, 0 (5), 5[bounded by 7]]
 counters: [6, 1 (5), 6[bounded by 7]]
 counters: [7, 2 (5), 7[bounded by 7]]
 counters: [8, 3 (5), 7[bounded by 7]]
 counters: [9, 4 (5), 7[bounded by 7]]
 counters: [10, 0 (5), 7[bounded by 7]]
 reset the counters
 counters: [0, 0 (5), 0[bounded by 7]]

 */



import java.util.List;
import java.util.ArrayList;

public class CounterTester{

    public static void main(String [] args){
        List<Counter> counters = new ArrayList<Counter>();

        counters.add(new IntCounter());
        counters.add(new ModularCounter(5));
        counters.add(new BoundedCounter(7));

        System.out.println("counters: " + counters);

        System.out.println("increment the counters");
        for (int i = 0; i < 11; i++){
            for(Counter c : counters){
                c.increment();
            }
            System.out.println("counters: " + counters);
        }

        System.out.println("reset the counters");
        for(Counter c : counters){
            c.reset();
        }

        System.out.println("counters: " + counters);
    }
}
