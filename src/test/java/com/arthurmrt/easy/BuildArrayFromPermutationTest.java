package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutationTest {

    /**
     * Input: nums = [0,2,1,5,3,4]
     * Output: [0,1,2,4,5,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     *     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
     *     = [0,1,2,4,5,3]
     */
    @Test
    void buildArray1() {
        BuildArrayFromPermutation permutation = new BuildArrayFromPermutation();
        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
        int[] output = permutation.buildArray(nums);

        assertEquals(nums.length, output.length);

        for (int i = 0; i < output.length; i++) {
            assertEquals(output[i], nums[nums[i]]);
        }
    }

    /**
     * Input: nums = [5,0,1,2,3,4]
     * Output: [4,5,0,1,2,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     *     = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
     *     = [4,5,0,1,2,3]
     */
    @Test
    void buildArray2() {
        BuildArrayFromPermutation permutation = new BuildArrayFromPermutation();
        int[] nums = new int[]{5,0,1,2,3,4};
        int[] output = permutation.buildArray(nums);

        assertEquals(nums.length, output.length);

        for (int i = 0; i < output.length; i++) {
            assertEquals(output[i], nums[nums[i]]);
        }
    }
}