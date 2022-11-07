package com.arthurmrt.educt.coderust_hacking_the_coding_interview;

import java.util.Arrays;

public class MoveZeros {
    static void moveZerosToLeft(int[] nums) {
        int read = nums.length - 1, write = nums.length - 1;

        while (write >= 0) {
            if (read < 0) {
                nums[write--] = 0;
            } else if(nums[read] == 0) {
                read--;
            } else {
                nums[write--] = nums[read--];
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        moveZerosToLeft(nums);
        int[] expected = {0, 0, 0, 1, 10, 20, 59, 63, 88};
        boolean isEqual = Arrays.equals(nums, expected);

        if (isEqual) {
            System.out.println("Success!");
        } else {
            System.out.println("Test fails");
            System.out.printf("expected: %s, actual: %s",
                    Arrays.toString(expected),
                    Arrays.toString(nums));
        }
    }
}