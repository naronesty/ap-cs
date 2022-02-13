/******************************************************************************
 *  Writer: Noakai Aronesty
 *  Compilation:  javac Rumors.java
 *  Execution:    java Rumors
 *
 *  Estimate the probability
 *  that everyone at the party (except Alice) will hear the rumor before it
 *  stops propagating. Also calculate an estimate of the expected number
 *  of people to hear the rumor.
 *
 *  % java Rumors 5 10000
 *  P(all heard): 0.2253
 *  expect number of people who heard rumor: 3.892
 *
 *  % java Rumors 3 10000
 *  P(all heard): 1.0
 *  expect number of people who heard rumor: 3.0
 ******************************************************************************/


public class Rumors {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double rumorGuests = 0.0;
        double allRumor = 0.0;

        if (n <= 2) {
            for (double j = 1.0; j < 4.0; j++) {
                if (n == j) {
                    System.out.println("P(all heard): " + 1.0);
                    System.out.println("expect number of people who heard rumor: " + j);
                }
            }
        }
        else {
            for (int k = 0; k < trials; k++) {

                int[] guests = new int[n];
                guests[0] = 2;
                double count = 0;


                while(true) {
//                    Impts.printArray(guests);

                    int r = (int) (Math.random() * (n));
                    while (guests[r] >= 2) r = (int) (Math.random() * (n));

                    for (int j = 0; j < n; j++) {
                        if (guests[j] == 2) {
                            guests[j] = 3;
                        }
                        else if (guests[j] == 3) {
                            guests[j] = 1;
                        }
                    }

                    if (guests[r] == 0) {
                        guests[r] = 2;
                    }
                    else break;
                }

                for (int guest: guests) {
                    if (guest > 0) count++;
                }
                if (count == n) allRumor ++;
                rumorGuests += count;
            }

            System.out.println("P(all heard): " + (allRumor / trials));
            System.out.println("expect number of people who heard rumor: " + (rumorGuests / trials));
        }
    }
}