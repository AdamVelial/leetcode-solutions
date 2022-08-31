package com.arthurmrt.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 703. Kth Largest Element in a Stream
//Quick select
//TODO don't pass leetcode tests
public class KthLargestQS {

    private final List<Integer> list;
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
    public KthLargestQS(int k, int[] nums) {
        this.list = new ArrayList<>(nums.length + 5);
        this.k = k;
        Arrays.stream(nums)
                .boxed()
                .forEach(list::add);
    }

    public int add(int val) {
        list.add(val);
        return select(list, list.size() - k);
    }

    public Integer select(List<Integer> list, int k) {
        if (0 > k || k >= list.size()) throw new IllegalArgumentException(String.format("%d out of indexes", k));

        int left = 0, right = list.size() - 1;
        while (right > left) {
            int partition = partition(list, left, right);
            if (partition > k) right -= 1;
            else if (partition < k) left += 1;
            else return list.get(partition);
        }
        return list.get(left);
    }

    private int partition(List<Integer> list, int left, int right) {
        final Integer pivot = list.get(left);

        int leftPointer = left;
        int rightPointer = right + 1;

        while (true) {
            while (list.get(++leftPointer) < pivot) if (leftPointer == right) break;
            while (pivot < list.get(--rightPointer)) if (rightPointer == left) break;
            if (leftPointer >= rightPointer) break;
            exchange(list, rightPointer, leftPointer);
        }
        exchange(list, left, rightPointer);
        return rightPointer;
    }

    private void exchange(List<Integer> list, int first, int second) {
        Integer temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */