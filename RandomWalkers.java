/******************************************************************************
 *  Group Members: Noakai Aronesty, Grace Jin, Daniel Chow
 *  Compilation:  javac RandomWalkers.java
 *  Execution:    java RandomWalkers
 *
 *  Prints mean squared distance of t random walkers (a person who takes one
 *  step in a random cardinal direction every step) who are taking n steps.
 *
 *  % java RandomWalkers 100 1000
 *  22107.348
 *
 *  % java RandomWalkers 3 19
 *  6.105263157894737
 *
 *  Analysis:
 *  As N increases, we expect the random walker to end up further and further
 * 	away from the origin. But how much further? Use RandomWalkers to formulate
 * 	a hypothesis as to how the mean squared distance grows as a function of N.
 * 	Use T = 100,000 trials to get a sufficiently accurate estimate.
 *
 * Hypothesis: The mean squared distance grows by about 5-7 times for each
 * double of n, with some outliers...
 *
 * Example trial runs:
 * % java Testing 10 100000
 * mean squared distance = 71.49128
 *
 * % java Testing 20 100000
 * mean squared distance = 344.34266
 *
 * % java Testing 30 100000
 * mean squared distance = 921.8368
 *
 * % java Testing 25 100000
 * mean squared distance = 589.48558
 *
 * % java Testing 50 100000
 * mean squared distance = 3394.46116
 *
 * % java Testing 100 100000
 * mean squared distance = 21979.71476
 *
 * % java Testing 200 100000
 * mean squared distance = 155675.99786
 ******************************************************************************/

public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        double x = 0;
        double y = 0;
        double dist = 0;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() < 0.25) x += 1;
                else if (Math.random() < 0.5) x -= 1;
                else if (Math.random() < 0.75) y += 1;
                else if (Math.random() < 1) y -= 1;
                dist += x * x + y * y;
            }
            x = 0;
            y = 0;
        }
        double ans = dist / t;
        System.out.print(ans);
    }
}