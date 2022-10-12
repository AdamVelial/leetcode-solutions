package com.arthurmrt.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 238. Product of Array Except Self
class ProductOfArrayExceptSelfTest {

    /**
     * Example 1:
     *
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     * Example 2:
     */
    @Test
    void example1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};

        int[] result = new ProductOfArrayExceptSelf().productExceptSelf(nums);

        assertArrayEquals(expected, result);
    }

    /**
     * Input: nums = [-1,1,0,-3,3]
     * Output: [0,0,9,0,0]
     *
     */
    @Test
    void example2() {
        int[] nums = {-1,1,0,-3,3};
        int[] expected = {0,0,9,0,0};

        int[] result = new ProductOfArrayExceptSelf().productExceptSelf(nums);

        assertArrayEquals(expected, result);
    }
}