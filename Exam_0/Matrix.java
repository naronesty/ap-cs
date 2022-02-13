package Exam_0;

import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Matrix.java
 *  Execution:    java Matrix
 ******************************************************************************/

public class Matrix {
    private int[][] mat;
    public Matrix(int[][] m) {
        mat = m;
    }

    // a)
    public void reverseAllRows() {
        for (int i = 0; i < mat.length; i++) {
            mat[i] = Impts.reverseArray(mat[i]);
        }
    }

    // b)
    public void reverseMatrix() {
        reverseAllRows();   
        for (int i = 0; i < mat.length/2; i++) {
            int[] temp = mat[i];
            mat[i] = mat[mat.length - i-1];
            mat[mat.length - i-1] = temp;
        }
    }

    public void printMatrix() {
        Impts.printArray(mat);
    }

    public static void main(String[] args) {
        Matrix rmatr = new Matrix(new int[][]{new int[]{1,2}, new int[]{3,4}, new int[]{5,6}});
        rmatr.reverseMatrix();
        rmatr.printMatrix();
    }
}
