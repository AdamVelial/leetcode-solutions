package com.arthurmrt;

import java.util.Arrays;

public class SortingS {
    public static void main(String[] args) {
        int[] A = new int[]{5, 2, 4, 1, 6, 3};

        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i > -1 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }

        System.out.println(Arrays.toString(A));
    }
}
