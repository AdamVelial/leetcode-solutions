package com.arthurmrt.medium;

import java.util.Arrays;

// 128. Longest Consecutive Sequence
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxConsecutive = 0;
        int currentConsecutive = 1;
        int before = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == before ) continue;

            if (nums[i] == (before + 1)) {
                currentConsecutive++;
            } else {
                maxConsecutive = Math.max(maxConsecutive, currentConsecutive);
                currentConsecutive = 1;
            }
            before = nums[i];
        }

        maxConsecutive = Math.max(maxConsecutive, currentConsecutive);

        return maxConsecutive;
    }
}
