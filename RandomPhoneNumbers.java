import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac RandomPhoneNumbers.java
 *  Execution:    java RandomPhoneNumbers
 ******************************************************************************/

public class RandomPhoneNumbers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        In in = new In("phone-na.txt");
        ArrayList<String> codes = new ArrayList<>();
        while (!in.isEmpty()) {
            String code = String.valueOf(in.readLine().split(",")[0]);
            codes.add(code);
        }

        HashSet<String> numbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String number = "(" + codes.get((int) (Math.random() * codes.size())) + ") " + (100 + (int)(Math.random() * 900)) + "-" + (1000 + (int)(Math.random() * 9000));
            if (numbers.contains(number)) {
                i--;
            }
            else {
                System.out.println(number);
            }
            numbers.add(number);
        }
    }
}
