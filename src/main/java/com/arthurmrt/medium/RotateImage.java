package com.arthurmrt.medium;

// 48. Rotate Image
public class RotateImage {
    public void rotate(int[][] matrix) {
        printMatrix(matrix);
        System.out.println();
        int n = matrix.length;

        int low = 0;
        int high = n - 1;

        // 1 итерация
        //
        // 1) меняем правый верхний на левый верхний
        int top1 = matrix[0][2];
        matrix[0][2] = matrix[0][0]; // matrix[0][2] | matrix[0][1]

        // 2) меняем правый нижний на правый верхний
        int right1 = matrix[2][2];
        matrix[2][2] = top1; // matrix[2][2] | matrix[1][2]

        // 3) меняем левый нижний на правый нижний
        int bottom1 = matrix[2][0];
        matrix[2][0] = right1; // matrix[2][0] | matrix[2][1]

        // 4) меняем левый верхний на левый нижний
        matrix[0][0] = bottom1; // matrix[0][0] | matrix[1][0]


        // 2 итерация
        //
        // 1) меняем правый на верхний
        int right2 = matrix[1][2];
        matrix[1][2] = matrix[0][1];

        // 2) меняем нижний на правый
        int bottom2 = matrix[2][1];
        matrix[2][1] = right2;

        // 3) меняем левый на нижний
        int left2 = matrix[1][0];
        matrix[1][0] = bottom2;

        // 4) верхний на левый
        matrix[0][1] = left2;


        printMatrix(matrix);
    }

    private void change(int fromRow, int fromCol, int toRow, int toCol, int[][] matrix) {
        System.out.println(String.format("%d,%d <-> %d,%d | %d <=> %d", fromRow, fromCol, toRow, toCol, matrix[fromRow][fromCol], matrix[toRow][toCol]));
        int temp = matrix[toRow][toCol];
        matrix[toRow][toCol] = matrix[fromRow][fromCol];
        matrix[fromRow][fromCol] = temp;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
}
