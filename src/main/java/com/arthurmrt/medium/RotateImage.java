package com.arthurmrt.medium;

// 48. Rotate Image
public class RotateImage {
    public void rotate(int[][] matrix) {
        printMatrix(matrix);
        System.out.println();

        int left = 0;
        int right = matrix.length - 1;

        int top = 0;
        int bottom = matrix.length - 1;

        while ( left < right ) {
            // save top left
            int topLeft = matrix[top][left]; // matrix[0][0]

            //move bottom left to top left
            matrix[top][left] = matrix[bottom][left]; // matrix[0][0] = matrix[2][0]

            //move bottom right into bottom left
            matrix[bottom][left] = matrix[bottom][right]; // matrix[2][0] = matrix[2][2]

            //move top right into bottom right
            matrix[bottom][right] = matrix[top][right]; // matrix[2][2] = matrix[0][2]

            //move top left into top right
            matrix[top][right] = topLeft; // matrix[0][0] = saved topLeft

            break;
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
