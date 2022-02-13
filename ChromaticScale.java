/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac ChromaticScale.java
 *  Execution:    java ChromaticScale
 *
 *  Desciption
 *
 *  % java ChromaticScale in
 *  out
 *
 *  % java ChromaticScale in
 *  out
 ******************************************************************************/

public class ChromaticScale {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i ++) {
            double hz = 440 * Math.pow(2, i / 12.0);
            int n = (int) (StdAudio.SAMPLE_RATE * 1);
            double[] a = new double[n + 1];
            for (int j = 0; j <= n; j++) {
                a[j] = Math.sin(2 * Math.PI * j * hz / StdAudio.SAMPLE_RATE);
            }
            StdAudio.play(a);
        }
    }
}
