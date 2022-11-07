package com.arthurmrt.educt.coderust_hacking_the_coding_interview;

import java.util.ArrayList;
import java.util.List;

class RotateArray {
    static void rotateArray(List<Integer> nums, int n) {
        int len = nums.size();

        n = n % len;
        if (n < 0)
            n = n + len;

        reverseList(nums, 0, len - 1);
        reverseList(nums, 0, n - 1);
        reverseList(nums, n, len - 1);
    }

    private static void reverseList(List<Integer> nums, int start, int end) {
        while (start < end) {
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 10, 20, 0, 59, 86, 32, 11, 9, 40};
        List<Integer> list = new ArrayList<>();
        for (int num : nums)
            list.add(num);

        System.out.println(list);
        rotateArray2(list, 2);
        System.out.println(list);
    }

    private static void rotateArray2(List<Integer> nums, int n) {
        int len = nums.size();
        n = n % len;
        if ( n < 0) n += len;

        List<Integer> part = new ArrayList<>(n);
        for (int i = len - n; i < len; i++) {
            part.add(nums.get(i));
        }

        for (int i = (len - n) - 1, j = len - 1; i >= 0; i--, j--) {
            nums.set(j, nums.get(i));
        }

        for (int i = 0; i < part.size(); i++) {
            nums.set(i, part.get(i));
        }
    }
}
