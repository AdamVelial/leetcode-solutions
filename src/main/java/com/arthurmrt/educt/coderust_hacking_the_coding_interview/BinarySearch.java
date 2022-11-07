package com.arthurmrt.educt.coderust_hacking_the_coding_interview;

public class BinarySearch {
    static int binarySearch(int[] nums, int target) {
        // TODO: Write - Your - Code
        int left = 0;
        int right = nums.length - 1;
        return binarySearch(nums, target, left, right);
    }

    private static int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) return -1;

        int p = left + (right - left) / 2;

        if(nums[p] > target) {
            return binarySearch(nums, target, left, p - 1);
        } else if(nums[p] < target) {
            return binarySearch(nums, target, p + 1, right);
        } else {
            return p;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        int i = binarySearch(nums, target);

        System.out.println(i);
    }
}
