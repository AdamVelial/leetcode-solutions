package com.arthurmrt.medium;

import java.util.Arrays;

// 36. Valid Sudoku
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int cubeSize = 3;

        // check rows
        int n = board.length;

        for (int i = 0; i < n; i++) {
            int[] nums = new int[10];

            for (int j = 0; j < n; j++) {
                int cell = board[i][j] - '0';
                if (10 > cell && cell > 0) {
                    nums[cell] += 1;
                    if (nums[cell] > 1) return false;
                }
            }
        }

        //check columns
        for (int i = 0; i < n; i++) {
            int[] nums = new int[10];

            for (int j = 0; j < n; j++) {
                int cell = board[j][i] - '0';
                if (10 > cell && cell > 0) {
                    nums[cell] += 1;
                    if (nums[cell] > 1) return false;
                }
            }

        }


        for (int rowOffset = 0; rowOffset < board.length; rowOffset += cubeSize) {

            System.out.println();

            for (int row = 0 + rowOffset; row < cubeSize + rowOffset; row++) {
                System.out.println();
                for (int column = 0; column < cubeSize; column++) {
                    System.out.printf("%s, ", board[row][column]);
                }
            }

        }

        return true;
    }
}
