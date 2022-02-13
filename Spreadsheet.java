public class Spreadsheet {
    public static void main(String[] args) {
        double[][] a = {
                { 99.0, 85.0, 98.0, 0.0 },
                { 98.0, 57.0, 79.0, 0.0 },
                { 92.0, 77.0, 74.0, 0.0 },
                { 94.0, 62.0, 81.0, 0.0 },
                { 99.0, 94.0, 92.0, 0.0 },
                { 80.0, 76.5, 67.0, 0.0 },
                { 76.0, 58.5, 90.5, 0.0 },
                { 92.0, 66.0, 91.0, 0.0 },
                { 97.0, 70.5, 66.5, 0.0 },
                { 89.0, 89.5, 81.0, 0.0 },
                {  0.0,  0.0,  0.0, 0.0 }
        };

        double avg = 0.0;
        double avgFinal = 0.0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                avg += a[i][j];
            }
            a[i][3] = avg / 3;
            avg = 0.0;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                avg += a[j][i];
            }
            a[10][i] = avg / 10;
            avgFinal += avg / 10;
            avg = 0.0;
        }
        a[10][3] = avgFinal / 3;

        double[] weights = {.25, .25, .5};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                avg += a[i][j] * weights[j];
            }
            a[i][3] = avg;
            avg = 0.0;
        }


        for (double[] student: a) {
            for (double score: student) {
                System.out.printf("%8.2f", score);
            }
            System.out.println();
        }
    }
}