/******************************************************************************
 *  Compilation:  javac PowersOfK.java
 *  Execution:    java PowersOfK
 *
 *  Prints Description of output
 *
 *  % java PowersOfK in
 *  out
 *
 *  % java PowersOfK in
 *  out
 ******************************************************************************/

public class PowersOfK {
    public static void main(String [] args){
        long k = Long.parseLong(args[0]);
        int i = 1;
        long powers = k;
        long max = Long.MAX_VALUE;
        while ( powers <= max / k){
            System.out.println(powers);
            i++;
            powers = (long) Math.pow(k,i);
        }

        System.out.println(powers);
    }
}