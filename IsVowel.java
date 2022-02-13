/******************************************************************************
 *  Compilation:  javac Name.java
 *  Execution:    java Name
 *
 *  Prints Description of output
 *
 *  % java Name in
 *  out
 *
 *  % java Name in
 *  out
 ******************************************************************************/

public class IsVowel {
    public static void main(String[] args) {
        String input = args[0];
        String lett = input.toLowerCase();
        switch(lett){
            case "a": case "e": case "i": case "o": case "u":
                System.out.print("It's a vowel");
                System.out.print(10/20);
                break;
            default:
                System.out.println("It's not a vowel");
        }
    }
}