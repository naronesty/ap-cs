import java.lang.*;
import java.io.*;
import java.util.*;

public class HW_2p1 {
    public static void main(String[] args) {
        System.out.println(dragon(1));
        System.out.println(dragon(2));
        System.out.println(dragon(3));
        System.out.println(dragon(4));
        System.out.println(dragon(5));
    }
    public static StringBuilder reverse(String x) {
        StringBuilder holder = new StringBuilder();
        holder.append(x);
        holder = holder.reverse();
        return holder;
    }
    public static String dragon(int n) {
        if (n == 0) {
            return "F";
        } else if (n == 1) {
            return "FLF";
        } else {
            StringBuilder piece2 = reverse(((dragon(n - 1).replace('L', 'T')).replace('R', 'L')).replace('T', 'R'));
            return dragon(n - 1) + "L" + piece2;
        }
    }
}