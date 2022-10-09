package com.arthurmrt.medium;

import org.junit.jupiter.api.Test;

class RotateImageTest {

    /**
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[7,4,1],[8,5,2],[9,6,3]]
     */
    @Test
    void example1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        new RotateImage().rotate(matrix);
    }

}