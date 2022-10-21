package com.arthurmrt.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    /**
     * Example 1:
     *
     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
     */
    @Test
    void example1() {
        int[] nums = new int[]{100,4,200,1,3,2};

        int longestConsecutive = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(4, longestConsecutive);
    }

    /**
     * Example 2:
     *
     * Input: nums = [0,3,7,2,5,8,4,6,0,1]
     * Output: 9
     *
     */
    @Test
    void example2() {
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};

        int longestConsecutive = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(9, longestConsecutive);
    }

    @Test
    void example3() {
        int[] nums = new int[]{1,2,0,1};

        int longestConsecutive = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(3, longestConsecutive);
    }
}