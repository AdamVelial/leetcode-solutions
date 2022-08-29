package com.arthurmrt.ds;

import java.util.Arrays;

public class Heap {
    public static void main(String[] args) {
        int[] array = {4, 5, 8, 2};

        //create heap
        createHeap(array);

        System.out.println(Arrays.toString(array));

        exchange(array, 1, array.length);
        array[array.length - 1] = 0;
        sink(array, 1, array.length);

        System.out.println(Arrays.toString(array));
    }

    private static void createHeap(int[] array) {
        int n = array.length;
        for (int i = n / 2; i >= 1; i--)
            sink(array, i, n);
    }

    private void swim(int[] array, int k) {
        while (k > 1 && less(array,k / 2, k)) {
            exchange(array, k, k / 2);
            k = k / 2;
        }
    }

    private static void sink(int[] array, int k, int n) {
        while (2 * k <= n) {
            int child = 2 * k;
            if (child < n && less(array, child, child + 1)) child += 1;
            if (!less(array, k, child)) break;
            exchange(array, k, child);
            k = child;
        }
    }

    public static boolean less(int[] array, int first, int second) {
        return array[first - 1] > array[second - 1];//array[first - 1] < array[second - 1];
    }

    private static void exchange(int[] array, int first, int second) {
        int temp = array[first - 1];
        array[first - 1] = array[second - 1];
        array[second - 1] = temp;
    }
}
