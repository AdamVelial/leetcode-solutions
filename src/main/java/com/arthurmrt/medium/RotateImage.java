package com.arthurmrt.medium;

// 48. Rotate Image
public class RotateImage {
    public void rotate(int[][] matrix) {
        printMatrix(matrix);
        System.out.println();
        int n = matrix.length;

        int low = 0;
        int high = n - 1;

        while (low < high) {

            // 1) меняем правый верхний на левый верхний
            int topRight = matrix[low][high];
            matrix[low][high] = matrix[low][low];

            // 2) меняем правый нижний на правый верхний
            int bottomRight = matrix[high][high];
            matrix[high][high] = topRight;

            // 3) меняем левый нижний на правый нижний
            int bottomLeft = matrix[high][low];
            matrix[high][low] = bottomRight;

            // 4) меняем левый верхний на левый нижний
            int topLeft = matrix[low][low];
            matrix[low][low] = bottomLeft;

            low += high;
        }

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
