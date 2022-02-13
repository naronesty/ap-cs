public class Histogram0 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0 ; i < n; i++) {
            a[i] = (int)(Math.random() * 101);
        }

        System.out.print("a[] : ");
        for (int x: a) {
            System.out.print(x + "  ");
        }
        System.out.println();
        int data[] = new int[11];
        for (int y: a) {
            if (y < 10) data[0] += 1;
            else if (y < 20) data[1] += 1;
            else if (y < 30) data[2] += 1;
            else if (y < 40) data[3] += 1;
            else if (y < 50) data[4] += 1;
            else if (y < 60) data[5] += 1;
            else if (y < 70) data[6] += 1;
            else if (y < 80) data[7] += 1;
            else if (y < 90) data[8] += 1;
            else if (y < 100) data[9] += 1;
            else data[10] += 1;
        }
        for (int j = 0; j < 11; j++) {
            System.out.print((j * 10) + ": ");
            for (int z = 0; z < data[j]; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}