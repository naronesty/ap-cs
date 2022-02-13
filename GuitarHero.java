/*****************************************************************************
 *  Names:        Bryan Zhang, Noakai Aronesty, Alyssa Choi, Christin Lin, Si Ying Ding
 *  Compilation:  javac GuitarHero.java
 *  Execution:    java  GuitarHero
 *  Dependencies: StdAudio.java StdDraw.java GuitarString.java
 *
 *  Plays two guitar strings (concert A and concert C) when the user
 *  types the lowercase letters 'a' and 'c', respectively in the 
 *  standard drawing window.
 *
 ****************************************************************************/

public class GuitarHero {

    public static void main(String[] args) {

        // Create two guitar strings, for concert A and C

        String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
        GuitarString[] array = new GuitarString[37];

        for (int i = 0; i < 37; i++) {
            double frequency = 440 * Math.pow(2, (1.0*i - 24) / 12);
            array[i] = new GuitarString(frequency);
        }

        // the main input loop
        while (true) {

            // check if the user has typed a key, and, if so, process it
            if (StdDraw.hasNextKeyTyped()) {

                // the user types this character
                char key = StdDraw.nextKeyTyped();

                // pluck the corresponding string
                if (keyboard.indexOf(key) != -1) { array[keyboard.indexOf(key)].pluck(); }
            }

            // compute the superposition of the samples
            double sample = 0;
            for (int k = 0; k < array.length; k++) {
                sample += array[k].sample();
            }
            // send the result to standard audio
            StdAudio.play(sample);

            // advance the simulation of each guitar string by one step
            for (int j = 0; j < array.length; j++) {
                array[j].tic();
            }
        }
    }

}