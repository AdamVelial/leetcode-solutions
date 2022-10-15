package com.arthurmrt.medium;

import java.util.*;

// 15. 3Sum
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ( (nums[i] + nums[j] + nums[k]) == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        answer.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(answer);
    }
}
