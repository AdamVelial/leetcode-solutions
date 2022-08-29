package com.arthurmrt.ds;

public class MaxPriorityQueue<Key extends Comparable<Key>> {

    private final Key[] heap;
    private int tail;

    public MaxPriorityQueue(int capacity) {
        this.heap = (Key[]) new Comparable[capacity + 1];
        this.tail = 0;
    }

    public void insert(Key item) {
        heap[++tail] = item;
        swim(tail);
    }

    public Key deleteMax() {
        Key max = heap[1];
        exchange(1, tail--);
        heap[tail + 1] = null;
        sink(1);
        return max;
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exchange(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k) {
        while (2*k <= tail) {
            int child = 2*k;
            if (child < tail && less(child, child + 1)) child++;
            if (!less(k, child)) break;
            exchange(k, child);
            k = child;
        }
    }

    private boolean less(int first, int second) {
        return heap[first].compareTo(heap[second]) < 0;
    }

    private void exchange(int first, int second) {
        Key temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    public int size() { return tail; }

    public boolean isEmpty() { return tail == 0; }
}
