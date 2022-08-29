package com.arthurmrt.ds;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxPriorityQueueTest {

    @Test
    void insertAndDeleteMaxTest() {
        int capacity = 10;
        var priorityQueue = new MaxPriorityQueue<Integer>(capacity);

        List<Integer> list = Stream.iterate(1, i -> ++i)
                .limit(10)
                .collect(Collectors.toList());

        Collections.shuffle(list);
        list.stream()
                .forEach(priorityQueue::insert);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEachOrdered( i -> assertEquals(i, priorityQueue.deleteMax()));
    }

    @Test
    void sizeTest() {
        int expectedSize = 100;
        var queue = new MaxPriorityQueue<String>(expectedSize);
        Stream.generate( () -> "str")
                .limit(expectedSize)
                .forEach(queue::insert);

        assertEquals(expectedSize, queue.size());
    }

    @Test
    void isEmptyTest() {
        var queue = new MaxPriorityQueue<String>(100);
        assertTrue(queue.isEmpty());
    }
}