import java.util.*;

/******************************************************************************
 *  Writers    :    Noakai Aronesty, Bryan Zhang, Christin Lin, Alyssa Choi, Jessica Eng, Han Zhang
 *  Compilation:    javac GPA.java
 *  Execution  :    java GPA
 *  Description:    A Map client GPA.java that creates a symbol table mapping letter       grades to numerical scores, as in the table below, and then reads from standard input a  list of letter grades and computes their average (GPA)
     A+   A    A-   B+   B    B-   C+   C    C-   D    F 
    4.33 4.00 3.67 3.33 3.00 2.67 2.33 2.00 1.67 1.00 0.00 
 ******************************************************************************/

public class GPA {
    public static double getGPA() {
        HashMap<String, Double> grades = new HashMap<>();
        grades.put("A+", 4.33);
        grades.put("A",  4.00);
        grades.put("A-", 3.67);
        grades.put("B+", 3.33);
        grades.put("B", 3.00);
        grades.put("B-", 2.67);
        grades.put("C+", 2.33);
        grades.put("C", 2.00);
        grades.put("C-", 1.67);
        grades.put("D", 1.00);
        grades.put("F", 0.00);

        double total = 0;
        int count = 0;
        while (!StdIn.isEmpty()) {
          String temp = StdIn.readString();
          total += grades.get(temp);
          count++;
        }
        return total / count;
    }
    public static void main(String[] args) {
      System.out.println(getGPA());
    }
}