package com.arthurmrt.easy;

import java.util.Arrays;

// 703. Kth Largest Element in a Stream
public class KthLargest {


    private final int[] nums;

    /**
     * Design a class to find the kth largest element in a stream.
     * Note that it is the kth largest element in the sorted order,
     * not the kth distinct element.
     * <p>
     * Implement KthLargest class:
     * <p>
     * KthLargest(int k, int[] nums) Initializes the object with the integer k
     * and the stream of integers nums.
     * int add(int val) Appends the integer val to the stream and returns the element representing
     * the kth largest element in the stream.
     */
    public KthLargest(int k, int[] nums) {
        this.nums = createHeap(nums, k);
    }

    public int add(int val) {
        if (val > nums[0]) {
            nums[0] = val;
            sink(nums, 1, nums.length);
        }
        return nums[0];
    }

    private int[] createHeap(int[] input, int k) {

        Arrays.sort(input);
        int[] array = new int[k];

        int srcPos = input.length - k;
        if (srcPos > 1) {
            System.arraycopy(input, srcPos, array, 0, k);
        }

        int n = array.length;
        for (int i = n / 2; i >= 1; i--)
            sink(array, i, n);

        return array;
    }

    private void sink(int[] array, int k, int n) {
        while (2 * k <= n) {
            int child = 2 * k;
            if (child < n && less(array, child, child + 1)) child += 1;
            if (!less(array, k, child)) break;
            exchange(array, k, child);
            k = child;
        }
    }

    public boolean less(int[] array, int first, int second) {
        return array[first - 1] > array[second - 1];
    }

    private void exchange(int[] array, int first, int second) {
        int temp = array[first - 1];
        array[first - 1] = array[second - 1];
        array[second - 1] = temp;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */