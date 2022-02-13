/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac RandomNoise.java
 *  Execution:    java RandomNoise
 *
 *  Desciption
 *
 *  % java RandomNoise in
 *  out
 *
 *  % java RandomNoise in
 *  out
 ******************************************************************************/

public class RandomNoise {
    public static void main(String[] args) {
        for (int i = 0; i < Integer.parseInt(args[0]); i ++) {
            double hz = 440 * Math.pow(2, Impts.randInt(0, 12) / 12.0);
            int n = (int) (StdAudio.SAMPLE_RATE * 1);
            double[] a = new double[n + 1];
            for (int j = 0; j <= n; j++) {
                a[j] = Math.sin(2 * Math.PI * j * hz / StdAudio.SAMPLE_RATE);
            }
            StdAudio.play(a);
        }
    }
}
