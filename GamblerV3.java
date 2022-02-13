/******************************************************************************
 *  Group Members: Noakai Aronesty, Grace Jin, Daniel Chow
 *
 *  Compilation:  javac GamblerV3.java
 *  Execution:    java GamblerV3 stake goal N
 *
 *  Simulates a gambler who start with $stake and place fair $1 bets
 *  until she goes broke or reach $goal. Keeps track of the number of
 *  times she wins and the number of bets she makes. Run the experiment N
 *  times, averages the results, and prints them out. Takes in a fixed probability
 *  that the gambler wins each bet.
 *
 *  % java GamblerV3 50 250 1000 0.5
 *  202 wins of 1000
 *  Percent of games won = 20.2
 *  Avg # bets           = 1025037.76
 *
 *  % java GamblerV3 50 150 1000 0.7
 *  1000 wins of 1000
 *  Percent of games won = 1000
 *  Avg # bets           = 252.084
 *
 *  % java GamblerV3 50 70 1000 0.45
 *  15 wins of 1000
 *  Percent of games won = 1.5
 *  Avg # bets           = 487.568
 *
 * Question: Use your program to try to learn how this probability
 * affects the chance of winning and the expected number of bets.
 * Try a value of p close to 0.5 (say, 0.48).
 *
 * Answer:
 * A decrease in probability greatly reduced the number of wins
 * into becoming zero and an increase in probability greatly
 * increased the number of wins to becoming 100 % when tested with
 * 1000 trials. However as the number of trials increased, the number
 * of wins would be less than a 100% and more than 0. Also if the
 * goal was closer to the initial gambling amount, the number of
 * trials won with a decrease in probability would be higher than
 * just 0.
 *
 * Ex.
 * % java GamblerV3 50 70 1000 0.45
 * 15 wins of 1000
 * Percent of games won = 1.5
 * Avg # bets           = 487.568
 *
 * % java GamblerV3 50 100 1000 0.45
 * 0 wins of 1000
 * Percent of games won = 0.0
 * Avg # bets           = 491.478
 *
 * % java GamblerV3 50 250 1000000 0.48
 * 1 wins of 1000000
 * Percent of games won = 1.0E-4
 * Avg # bets           = 1249.029516
 *
 * Conclusion: The number of trials has to be big, and the stakes
 * and goals have to be closer together to get a good representation
 * of the way probability changes results, otherwise it would head
 * to two extremes- having won all games, or winning no games at all.
 ******************************************************************************/

public class GamblerV3 {
    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform
        double fixedavg = Double.parseDouble(args[3]);     // a fixed probabilty that the gambler wins each bet

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() <= fixedavg) cash++;     // win $1
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
