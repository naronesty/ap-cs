import java.awt.Color;
import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac PhotoMagic.java
 *  Execution:    java PhotoMagic
 *
 *  Description: uses LFSR.java to implement a simple
 *  encode/decode facility for photographs.
 ******************************************************************************/

public class PhotoMagic {
    public static Picture convert(Picture imgn, LFSR lfsr) {
        int w = imgn.width();
        int h = imgn.height();

        for (int col = 0; col < w; col++) {
            for (int row = 0; row < w; row++) {
                Color color = imgn.get(col, row);

                int r = color.getRed() ^ lfsr.generate(8);
                int g = color.getGreen() ^ lfsr.generate(8);
                int b = color.getBlue() ^ lfsr.generate(8);

                imgn.set(col, row, new Color(r, g, b));

            }
        }
        return imgn;
    }

    public static void main(String[] args) {
        Picture imgn = new Picture(args[0]);
        String pswrd = args[1];
        int tap = Integer.parseInt(args[2]);

        LFSR lfsr = new LFSR(pswrd, tap);
        Picture newPicture = convert(imgn, lfsr);

        newPicture.save("X" + args[0]);
        newPicture.show();

    }
}