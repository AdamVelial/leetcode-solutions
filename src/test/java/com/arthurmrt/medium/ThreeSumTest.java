package com.arthurmrt.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumTest {
    /**
     * Example 1:
     * <p>
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not matter.
     */
    @Test
    void example1() {
        int[] num = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));

        List<List<Integer>> result = new ThreeSum().threeSum(num);

        Assertions.assertEquals(expected, result);
    }

    /**
     * Example 2:
     * <p>
     * Input: nums = [0,1,1]
     * Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     */
    @Test
    void example2() {
        int[] num = new int[]{0 , 1, 1};
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> result = new ThreeSum().threeSum(num);

        Assertions.assertEquals(expected, result);
    }

    /**
     * Example 3:
     * <p>
     * Input: nums = [0,0,0]
     * Output: [[0,0,0]]
     * Explanation: The only
     */
    @Test
    void example3() {
        int[] num = new int[]{0, 0, 0};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));

        List<List<Integer>> result = new ThreeSum().threeSum(num);

        Assertions.assertEquals(expected, result);
    }
}