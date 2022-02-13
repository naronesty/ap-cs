/******************************************************************************
 *  Group Members: Noakai Aronesty, Grace Jin, Daniel Chow
 *  Compilation:  javac GamblerV4.java
 *  Execution:    java GamblerV4 stake goal N
 *
 *  Simulates a gambler who start with $stake and place fair $1 bets
 *  until she goes broke or reach $goal. Keeps track of the number of
 *  times she wins and the number of bets she makes. Accepts an input for
 *  the maximum amount of bets the Gambler can make. Run the experiment N
 *  times, averages the results, and prints them out. Also prints expected
 *  money at the end of each game.
 *
 *  % java GamblerV4 50 250 1000 5000
 *  107 wins of 1000
 *  Percent of games won = 10.7
 *  Avg # bets           = 5000.0
 *  Expected final cash  = 25.0
 *
 *  % java GamblerV4 50 150 1000 500
 *  34 wins of 1000
 *  Percent of games won = 3.4
 *  Avg # bets           = 500.0
 *  Expected final cash  = 5.0
 *
 *  % java GamblerV4 50 100 1000 1000
 *  201 wins of 1000
 *  Percent of games won = 20.1
 *  Avg # bets           = 1000.0
 *  Expected final cash  = 20.0
 ******************************************************************************/

public class GamblerV4 {
    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform
        int betmax = Integer.parseInt(args[3]);    // max amount of bets

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal && (1.0 * bets / trials) < betmax) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
        if (betmax < ((stake * stake) * (goal / stake - 1))) {
            System.out.println("Expected final cash  = " + 1.0 * stake * (1.0 * betmax / ((stake * stake) * (1.0 * goal / stake - 1))));
        }
        else {
            System.out.println("Expected final cash  = " + stake);
        }
    }
}