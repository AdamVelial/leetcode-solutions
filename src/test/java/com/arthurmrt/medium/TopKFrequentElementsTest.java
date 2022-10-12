package com.arthurmrt.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    /**
     * Example 1:
     *
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     */
    @Test
    void example() {
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;

        int[] result = new TopKFrequentElements().topKFrequent(nums, k);

        Arrays.sort(result);
        assertArrayEquals(new int[]{1,2}, result);
    }

    /**
     * Example 2:
     *
     * Input: nums = [1], k = 1
     * Output: [1]
     *
     */
    @Test
    void example2() {
        int[] nums = new int[]{1};
        int k = 1;

        int[] result = new TopKFrequentElements().topKFrequent(nums, k);

        assertArrayEquals(new int[]{1}, result);
    }
}