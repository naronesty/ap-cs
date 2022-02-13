import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac CaesarCipher.java
 *  Execution:    java CaesarCipher
 ******************************************************************************/

public class CaesarCipher {
    public static void main(String[] args) {
        ArrayList<String> alpha = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        ArrayList<String> alphaRot = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        System.out.print("Your message? ");
        Scanner sc0 = new Scanner(System.in);
        String message = sc0.nextLine().toUpperCase();
        String[] messArr = message.split("");
        System.out.print("Encoding key? ");
        int key = sc0.nextInt();
        Collections.rotate(alphaRot, -key);
        String code = "";
        for (String i: messArr) {
            if (!alpha.contains(i)) {
                code += i;
            }
            else code += alphaRot.get(alpha.indexOf(i));
        }
        System.out.println(code);
    }
}
