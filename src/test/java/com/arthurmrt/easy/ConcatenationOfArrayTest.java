package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {

    /**
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     */
    @Test
    void getConcatenation() {
        ConcatenationOfArray concat = new ConcatenationOfArray();
        int[] nums = new int[]{1,2,1};

        assertArrayEquals(new int[]{1,2,1,1,2,1},concat.getConcatenation(nums));
    }

     /**
     * Input: nums = [1,3,2,1]
     * Output: [1,3,2,1,1,3,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
     * - ans = [1,3,2,1,1,3,2,1]
     */
     @Test
     void getConcatenation2() {
         ConcatenationOfArray concat = new ConcatenationOfArray();
         int[] nums = new int[]{1,3,2,1};

         assertArrayEquals(new int[]{1,3,2,1,1,3,2,1},concat.getConcatenation(nums));
     }
}