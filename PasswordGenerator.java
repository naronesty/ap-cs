import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac PasswordGenerator.java
 *  Execution:    java PasswordGenerator
 ******************************************************************************/

public class PasswordGenerator {
    public String prefix;
    public int length;
    public static int count = 0;

    public PasswordGenerator(int len, String pref) {
        prefix = pref;
        length = len;
    }

    public PasswordGenerator(int len) {
        prefix = "A";
        length = len;
    }

    public String pwGen() {
        count++;
        String password = prefix + ".";
        for (int i = 0; i < length; i++) {
            password += (int)(Math.random() * 10);
        }
        return password;
    }

    public int pwCount() {
        return count;
    }

    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw1.pwCount());
        System.out.println(pw2.pwCount());
    }
}
