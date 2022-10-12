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


        for (int f = 0; f < board.length; f += cubeSize) {

            System.out.println();
            for (int i = 0 + f; i < cubeSize + f; i++) {
                System.out.println();
                for (int j = 0; j < cubeSize; j++) {
                    System.out.printf("%s, ", board[i][j]);
                }
            }

        }

        return false;
    }
}
