/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac TitiusBode.java
 *  Execution:    java TitiusBode
 *
 *  Desciption
 *
 *  % java TitiusBode in
 *  out
 *
 *  % java TitiusBode in
 *  out
 ******************************************************************************/

public class TitiusBode {
    public static double getLaw(int k) {
        if (k == 1) return 1;
        else if (k == 2) return 3;
        else return (getLaw(k - 1) * 2);
    }
    public static double getTitiusBodeDistance(int k) {
        return (4 + getLaw(k)) / 10.0;
    }

    public static void main(String[] args) {
        System.out.println(getTitiusBodeDistance(6));
    }
}
