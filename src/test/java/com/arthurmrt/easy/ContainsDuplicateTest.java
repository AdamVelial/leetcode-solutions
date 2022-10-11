package com.arthurmrt.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    /**
     * Example 1
     *
     * Input: nums = [1,2,3,1]
     * Output: true
     */
    @Test
    void example() {
        int[] nums = {1, 2, 3, 1};

        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(nums));
    }

    /**
     * Example 2
     *
     * Input: nums = [1,2,3,4]
     * Output: false
     */
    @Test
    void example2() {
        int[] nums = new int[]{1,2,3,4};

        Assertions.assertFalse(new ContainsDuplicate().containsDuplicate(nums));
    }

    /**
     * Example 3
     *
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    @Test
    void example3() {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};

        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(nums));
    }
}