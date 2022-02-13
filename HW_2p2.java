public class HW_2p2 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(1));
        System.out.println(Fibonacci(2));
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(4));
        System.out.println(Fibonacci(5));
    }

    public static String Fibonacci(int n) {
        if (n == 0) {
            return "a";
        } else if (n == 1) {
            return "b";
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}