package com.arthurmrt.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

// 703. Kth Largest Element in a Stream
public class KthLargest {

    private List<Integer> list;
    private int k;

    /**
     * Design a class to find the kth largest element in a stream.
     * Note that it is the kth largest element in the sorted order,
     * not the kth distinct element.
     *
     * Implement KthLargest class:
     *
     * KthLargest(int k, int[] nums) Initializes the object with the integer k
     * and the stream of integers nums.
     * int add(int val) Appends the integer val to the stream and returns the element representing
     * the kth largest element in the stream.
     */
    public KthLargest(int k, int[] nums) {
        this.list = copy(nums);
        this.k = k;
    }

    public int add(int val) {
        int size = list.size();
        for (int i = 0; i <= size; i++) {
            if (i == size) {
                list.add(val);
            }
            if (list.get(i) > val) {
                list.add(i, val);
                break;
            }
        }

        int index = (list.size() - 1) - (k - 1);
        return list.get(index);
    }

    public List<Integer> copy(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);

        Arrays.stream(nums)
                .sorted()
                .mapToObj(Integer::valueOf)
                .forEachOrdered(list::add);

        return list;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 1; i < 100; i++) {
            //ad(i, queue);
            queue.add(i);
        }


        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

    private static void ad(int val, PriorityQueue<Integer> queue) {
        if (queue.size() != 3) {
            queue.offer(val);
        } else {
            if (val > queue.peek()) {
                queue.poll();
                queue.offer(val);
            }
        }
    }


}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */