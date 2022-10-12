package com.arthurmrt.medium;

import javax.swing.*;
import java.util.*;
import java.util.function.BiFunction;

// 347. Top K Frequent Elements
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(
                Map.Entry::getValue
        ));

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], 0);
            map.computeIfPresent(nums[i], (key, v) -> v + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.stream()
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
