package com.arthurmrt.interviewbit;

import java.util.Arrays;

public class REC_CMPL1 {

    /*
     * V is sorted
     * V.size() = N
     * The function is initially called as searchNumOccurrence(V, k, 0, N-1)
     */
    int searchNumOccurrence(int[] V, int k, int start, int end) {
        System.out.println("searchNumOccurrence( v=" + Arrays.toString(V) + ", k=" + k + ", start=" + start + ", end=" + end + " );");
        if (start > end) return 0;
        int mid = (start + end) / 2;
        if (V[mid] < k) return searchNumOccurrence(V, k, mid + 1, end);
        if (V[mid] > k) return searchNumOccurrence(V, k, start, mid - 1);
        return searchNumOccurrence(V, k, start, mid - 1) + 1 + searchNumOccurrence(V, k, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        Arrays.fill(arr, 5);

        int i = new REC_CMPL1().searchNumOccurrence(arr, 5, 0, arr.length - 1);
        System.out.println(i);
    }
}
