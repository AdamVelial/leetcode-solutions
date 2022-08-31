package com.arthurmrt.ds;

import java.util.Arrays;
import java.util.List;

public class Quick {
    public static void main(String[] args) {
        Integer[] array = {5, 3, 1, 2, 4};

        // 2th largest element
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf("%dth larger element: %d %s", i, select(array, i), System.lineSeparator());
        }
    }

    public static Integer select(Integer[] array, int k) {
        if (0 > k || k >= array.length) throw new IllegalArgumentException(String.format("%d out of indexes", k));

        int left = 0, right = array.length - 1;
        while (right > left) {
            int partition = partition(array, left, right);
            if (partition > k) right -= 1;
            else if (partition < k) left += 1;
            else return array[partition];
        }
        return array[left];
    }

    private static int partition(Integer[] array, int left, int right) {
        final Integer pivot = array[left];

        int leftPointer = left;
        int rightPointer = right + 1;

        while (true) {
            while (array[++leftPointer] < pivot) if (leftPointer == right) break;
            while (pivot < array[--rightPointer]) if (rightPointer == left) break;
            if (leftPointer >= rightPointer) break;
            exchange(array, rightPointer, leftPointer);
        }
        exchange(array, left, rightPointer);
        return rightPointer;
    }

    private static void exchange(Integer[] array, int first, int second) {
        Integer temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
