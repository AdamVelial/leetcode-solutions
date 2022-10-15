package com.arthurmrt.medium;

import java.util.*;

// 15. 3Sum
public class ThreeSum {

    //
    public List<List<Integer>> threeSum(int[] nums) {
        // O(n*log n)
        Arrays.sort(nums);
        Set<List<Integer>> answer = new HashSet<List<Integer>>();

        // O (n^2)
        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if ( sum < 0 ) {
                    left++;
                } else if ( sum > 0) {
                    right--;
                } else {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    Collections.sort(triplet);
                    answer.add(triplet);
                    left++;
                    right--;
                }
            }
        }

        return new ArrayList<>(answer);
    }


    // O(n^3)
    public List<List<Integer>> threeSum_Old(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ( (nums[i] + nums[j] + nums[k]) == 0 ) {
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
