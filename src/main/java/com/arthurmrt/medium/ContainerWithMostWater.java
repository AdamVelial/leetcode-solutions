package com.arthurmrt.medium;

// 11. Container With Most Water
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            int leftHight = height[left];
            int rightHight = height[right];

            int x = (right + 1) - (left + 1);
            int y = leftHight > rightHight ? rightHight : leftHight;

            int area = x * y;

            if (area > maxArea) maxArea = area;

            if (leftHight < rightHight) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
