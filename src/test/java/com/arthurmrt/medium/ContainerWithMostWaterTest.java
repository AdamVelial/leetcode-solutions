package com.arthurmrt.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    /**
     * Example 1
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
     * In this case, the max area of water (blue section) the container can contain is 49.
     */
    @Test
    void example1() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int expected = 49;

        int maxArea = new ContainerWithMostWater().maxArea(height);

        assertEquals(expected, maxArea);
    }

    /**
     * Example 2:
     *
     * Input: height = [1,1]
     * Output: 1
     */
    @Test
    void example2() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int expected = 49;

        int maxArea = new ContainerWithMostWater().maxArea(height);

        assertEquals(expected, maxArea);
    }
}