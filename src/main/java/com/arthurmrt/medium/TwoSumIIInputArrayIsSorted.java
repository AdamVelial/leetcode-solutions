package com.arthurmrt.medium;

// 167. Two Sum II - Input Array Is Sorted
public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left != right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{++left, ++right};
            } else if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            }
        }

        return null;
    }
}
