
/*************************************************************************
 *  Names:        Bryan Zhang, Noakai Aronesty, Alyssa Choi, Christin Lin, Si Ying Ding
 * PennKey      : 
 * Recitation # :
 *
 * Dependencies :
 * Description  : 
 *  
 *  This is a template file for GuitarString.java. It lists the constructors
 *  and methods you need, along with descriptions of what they're supposed
 *  to do.
 *  
 *  Note: it won't compile until you fill in the constructors and methods
 *        (or at least commment out the ones whose return type is non-void).
 *
 *****************************************************************************/

public class GuitarString {

    private RingBuffer buffer; // ring buffer
    private int frequency;
    private int ticNum;

    // create a guitar string of the given frequency
    public GuitarString(double frequency) {
      int cap = 0;
      if (44100 % frequency == 0) {
        cap = (int)(1.0 * 44100 / frequency);
      }
      else cap = (int)(1.0 * 44100 / frequency);
      buffer = new RingBuffer(cap);
      for (int i = 0; i < cap; i++) {
        buffer.enqueue(0.0);
      }
    }

    // create a guitar string with size & initial values given by the array
    public GuitarString(double[] init) {
        buffer = new RingBuffer(init.length);
        for (double i: init) {
          buffer.enqueue(i);
        }
    }

    // pluck the guitar string by replacing the buffer with white noise
    public void pluck() {
        for (int i = 0; i < buffer.size(); i++) {
          buffer.dequeue();
          buffer.enqueue(Math.random() - 0.5);
        }
    }

    // advance the simulation one time step
    public void tic() {
        double addit = ((buffer.dequeue() + buffer.peek()) / 2) * 0.994;
        buffer.enqueue(addit);
        ticNum++;
    }

    // return the current sample
    public double sample() {
        return buffer.peek();
    }

    // return number of times tic was called
    public int time() {
        return ticNum;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] samples = { .2, .4, .5, .3, -.2, .4, .3, .0, -.1, -.3 };  
        GuitarString testString = new GuitarString(samples);
        for (int i = 0; i < N; i++) {
            int t = testString.time();
            double sample = testString.sample();
            System.out.printf("%6d %8.4f\n", t, sample);
            testString.tic();
        }
    }

}
