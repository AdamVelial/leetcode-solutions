package com.arthurmrt.easy;

import java.util.PriorityQueue;

// 703. Kth Largest Element in a Stream
public class KthLargest {

    private PriorityQueue<Integer> priorityQueue;
    private final int k;

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
        priorityQueue = new PriorityQueue<>();
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
        }
        while (priorityQueue.size() > k)
            priorityQueue.poll();
    }

    public int add(int val) {
        priorityQueue.add(val);
        if (priorityQueue.size() > k)
            priorityQueue.poll();

        return priorityQueue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */