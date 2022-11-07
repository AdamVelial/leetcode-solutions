package com.arthurmrt.educt.coderust_hacking_the_coding_interview;

import java.util.Arrays;

class LeastCommonNumber {
    static Integer findLeastCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
        // TODO: Write - Your - Code
        for(int i = 0; i < arr1.length; i++){
            int num = arr1[i];

            if(binarySearch(arr2, num) > 0) {
                if(binarySearch(arr3, num) > 0)
                    return num;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (left - left) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    // time: O(n), memory: O(1)
    static Integer findLeastCommonNumber2(int[] arr1, int[] arr2, int[] arr3) {
        int p1 = 0, p2 = 0, p3 = 0;
        while(p1 < arr1.length && p2 < arr2.length && p3 < arr3.length){
            if(arr1[p1] == arr2[p2] && arr2[p2] == arr3[p3]) return arr1[p1];

            if(arr1[p1] < arr2[p2] && arr1[p1] < arr3[p3]) {
                    p1++;
            } else if(arr2[p2] < arr1[p1] && arr2[p2] < arr3[p3]) {
                p2++;
            } else if(arr3[p3] < arr1[p1] && arr3[p3] < arr2[p2]) {
                p3++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] v1 = new int[] {6, 7, 10, 25, 30, 63, 64};
        int[] v2 = new int[] {0, 4, 5, 6, 7, 8, 50};
        int[] v3 = new int[] {1, 6, 10, 14};
        System.out.println("Array 1: " + Arrays.toString(v1));
        System.out.println("Array 2: " + Arrays.toString(v2));
        System.out.println("Array 3: " + Arrays.toString(v3));

        Integer result = findLeastCommonNumber2(v1, v2, v3);
        System.out.println("Least Common Number: " + result);
    }
}