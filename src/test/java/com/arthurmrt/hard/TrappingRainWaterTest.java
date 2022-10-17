package com.arthurmrt.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    /**
     * Example 1
     * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * Output: 6
     * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
     * In this case, 6 units of rain water (blue section) are being trapped.
     */
    @Test
    void example1() {
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;

        int amount = new TrappingRainWater().trap(height);

        assertEquals(expected, amount);
    }

    /**
     * Example 2:
     *
     * Input: height = [4,2,0,3,2,5]
     * Output: 9
     */
    @Test
    void example2() {
        int[] height = new int[] {4,2,0,3,2,5};
        int expected = 9;

        int amount = new TrappingRainWater().trap(height);

        assertEquals(expected, amount);
    }
}