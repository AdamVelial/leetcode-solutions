package com.arthurmrt.medium;

// 48. Rotate Image
public class RotateImage {
    public void rotate(int[][] matrix) {
        printMatrix(matrix);
        System.out.println();

        int left = 0;
        int right = matrix.length - 1;


        while ( left < right ) {
            for (int i = 0; i < right - left; i++) {

                int top = left;
                int bottom = right;

                // save top left
                int topLeft = matrix[top][left + i]; // matrix[0][0]

                //move bottom left to top left
                matrix[top][left + i] = matrix[bottom - i][left]; // matrix[0][0] = matrix[2][0]

                //move bottom right into bottom left
                matrix[bottom - i][left] = matrix[bottom][right - i]; // matrix[2][0] = matrix[2][2]

                //move top right into bottom right
                matrix[bottom][right - i] = matrix[top + i][right]; // matrix[2][2] = matrix[0][2]

                //move top left into top right
                matrix[top + i][right] = topLeft; // matrix[0][0] = saved topLeft

            }
            right -= 1;
            left  += 1;
        }

        printMatrix(matrix);
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
