/******************************************************************************
 *  Group Members: Noakai Aronesty, Grace Jin, Daniel Chow
 *  Compilation:  javac Gambler.java
 *  Execution:    java Gambler stake goal N
 *
 *  Simulates a gambler who start with $stake and place fair $1 bets
 *  until she goes broke or reach $goal. Keeps track of the number of
 *  times she wins and the number of bets she makes. Run the experiment N
 *  times, averages the results, and prints them out.
 *
 *  % java Gambler 50 250 1000
 *  178 wins of 1000
 *  Percent of games won = 17.8
 *  Avg # bets           = 10010.79
 *
 *  % java Gambler 50 150 1000
 *  337 wins of 1000
 *  Percent of games won = 33.7
 *  Avg # bets           = 4863.95
 *
 *  % java Gambler 50 100 1000
 *  503 wins of 1000
 *  Percent of games won = 50.3
 *  Avg # bets           = 2464.59
 *
 *  Questions:
 *  2. Run the simulation and determine the following results.
 *    a. If you go to Monte Carlo to try to turn $500 into $2,500 what is your
 *    chance of success?
 *  About 20%
 *    b. How many bets should you expect to make?
 *  About 1,000,000
 * 	  c. If you try to turn $1 into $1000 what is your chance of success?
 *  About 0.01%
 *    d. How many bets should you expect to make?
 *  About 1,000
 *
 *  3. Use empirical results from the simulation, determine the probability of
 *     success in terms of the stake and the goal.
 *  Probability = goal / stake
 *  4. Empirically determine the expected number of bets in terms
 *    	of the stake and the goal.
 *  stake ^ 2 * (goal / stake - 1)
 ******************************************************************************/

public class Gambler {

    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
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
    }
}
