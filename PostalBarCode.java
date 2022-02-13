import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty, Sean Gaines, Christin Lin, Jishan Chowdhury, Vincent Lin
 *  Compilation:  javac PostalBarCode.java
 *  Execution:    java PostalBarCode
 ******************************************************************************/

public class PostalBarCode implements Comparable<PostalBarCode>{
    private String barCode;
    private String zipCode;

    // CONSTRUCTOR
    public PostalBarCode(String zip) {
        zipCode = zip;
        String[] postalCodes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
        String[] x = zip.split("");
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }

        Impts.append(y, (Impts.sumArray(y) % 10));
        barCode = "|";
        for (int i: y) {
            barCode += postalCodes[i];
        }
        barCode += "|";
    }

    @Override
    public String toString() {
        return barCode;

    }

    // ACCESSORS
    public String getZip() {
        return zipCode;

    }
    public String getBarCode() {
        return barCode;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof PostalBarCode){
            PostalBarCode code = (PostalBarCode)obj;
            return code.zipCode.equals(this.zipCode);
        }
        return false;
    }
    public int compareTo(PostalBarCode rhs){
        return this.zipCode.compareTo(rhs.zipCode);
    }

}