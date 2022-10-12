package com.arthurmrt.medium;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] answer = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }

        postfix[postfix.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            postfix[i] = nums[i] * postfix[i + 1];
        }

        for (int i = 0; i < answer.length; i++) {
            int pre = i == 0 ? 1 : prefix[i - 1];
            int post = i == answer.length - 1 ? 1 : postfix[i + 1];

            answer[i] = pre * post;
        }

        return answer;
    }
}
