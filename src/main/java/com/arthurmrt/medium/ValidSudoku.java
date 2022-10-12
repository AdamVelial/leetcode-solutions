package com.arthurmrt.medium;

import java.util.Arrays;

// 36. Valid Sudoku
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int cubeSize = 3;

        // check rows
        int n = board.length;

        for (int i = 0; i < n; i++) {
            int[] rowNums = new int[10];
            int[] columnNums = new int[10];

            for (int j = 0; j < n; j++) {
                int rowCell = board[i][j] - '0';
                if (10 > rowCell && rowCell > 0) {
                    rowNums[rowCell] += 1;
                    if (rowNums[rowCell] > 1) return false;
                }
                int columnCell = board[j][i] - '0';
                if (10 > columnCell && columnCell > 0) {
                    columnNums[columnCell] += 1;
                    if (columnNums[columnCell] > 1) return false;
                }

            }
        }


        // 3 size matrix
        for (int columnOffset = 0; columnOffset < board.length; columnOffset += cubeSize) {

            for (int rowOffset = 0; rowOffset < board.length; rowOffset += cubeSize) {

                System.out.println();

                int[] nums = new int[10];
                for (int row = 0 + rowOffset; row < cubeSize + rowOffset; row++) {
                    System.out.println();
                    for (int column = 0 + columnOffset; column < cubeSize + columnOffset; column++) {
                        int cell = board[row][column] - '0';
                        if (10 > cell && cell > 0) {
                            nums[cell] += 1;
                            if (nums[cell] > 1) return false;
                        }
                    }
                }

            }
        }

        return true;
    }
}
