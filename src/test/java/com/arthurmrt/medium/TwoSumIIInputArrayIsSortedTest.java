package com.arthurmrt.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIIInputArrayIsSortedTest {

    /**
     * Example 1:
     *
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     */
    @Test
    void example1() {
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;

        int[] twoSum = new TwoSumIIInputArrayIsSorted().twoSum(numbers, target);
        assertArrayEquals(new int[]{1,2}, twoSum);
    }

    /**
     * Example 2:
     *
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
     */
    @Test
    void example2() {
        int[] numbers = new int[]{2,3, 4};
        int target = 6;

        int[] twoSum = new TwoSumIIInputArrayIsSorted().twoSum(numbers, target);
        assertArrayEquals(new int[]{1,3}, twoSum);
    }

    /**
     * Example 3:
     *
     * Input: numbers = [-1,0], target = -1
     * Output: [1,2]
     * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
     *
     */
    @Test
    void example3() {
        int[] numbers = new int[]{-1, 0};
        int target = -1;

        int[] twoSum = new TwoSumIIInputArrayIsSorted().twoSum(numbers, target);
        assertArrayEquals(new int[]{1,2}, twoSum);
    }
}