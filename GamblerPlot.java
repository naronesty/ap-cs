/******************************************************************************
 *  Group Members: Noakai Aronesty, Grace Jin, Daniel Chow
 *  Compilation:  javac GamblerPlot.java
 *  Execution:    java GamblerPlot stake goal N
 *
 *  Simulates a gambler who start with $stake and place fair $1 bets
 *  until she goes broke or reach $goal. Keeps track of the number of
 *  times she wins and the number of bets she makes. Run the experiment N
 *  times, averages the results, and prints them out. Also prints a plot of
 *  the amount of money the gambler has at the end of each bet and trial.
 *
 *  % java GamblerPlot 3 6 3
 *  * * * *
 *  * * *
 *  * *
 *  * * *
 *  * *
 *  * * *
 *  * * * *
 *  * * *
 *  * * * *
 *  * * * * *
 *  * * * *
 *  * * *
 *  * * * *
 *  * * * * *
 *  * * * *
 *  * * * * *
 *  * * * * * *
 *  End of trial #1
 *
 *  * *
 *  * * *
 *  * * * *
 *  * * *
 *  * * * *
 *  * * *
 *  * *
 *  *
 *
 *  End of trial #2
 *
 *  * *
 *  * * *
 *  * * * *
 *  * * *
 *  * *
 *  *
 *
 *  End of trial #3
 *
 *  * * * *
 *  * * *
 *  * * * *
 *  * * * * *
 *  * * * * * *
 *
 *  End of trial #4
 *
 *  * *
 *  *
 *  * *
 *  *
 *
 *  End of trial #5
 *
 *  2 wins of 5
 *  Percent of games won = 40.0
 *  Avg # bets           = 8.6
 *
 *  % java GamblerPlot 2 4 3
 *  * * *
 *  * * * *
 *
 *  End of trial #1
 *
 *  * * *
 *  * * * *
 *
 *  End of trial #2
 *
 *  * * *
 *  * *
 *  *
 *  * *
 *  * * *
 *  * *
 *  * * *
 *  * * * *
 *
 *  End of trial #3
 *
 *  3 wins of 3
 *  Percent of games won = 100.0
 *  Avg # bets           = 4.0
 ******************************************************************************/

public class GamblerPlot {
    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        int t = 0;
        while (t < trials) {
            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
                for (int i = 0; i < cash; i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
            System.out.println("End of trial #" + (t + 1));
            t++;
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
}