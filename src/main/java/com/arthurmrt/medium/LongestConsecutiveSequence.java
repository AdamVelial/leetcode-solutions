package com.arthurmrt.medium;

import java.util.HashSet;
import java.util.Set;

// 128. Longest Consecutive Sequence
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int largestStreak = 0;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int currentStreak = 1;
                int number = num;
                while (set.contains(++number)) {
                    currentStreak++;
                }

                largestStreak = Math.max(currentStreak, largestStreak);
            }
        }

        return largestStreak;
    }
}
