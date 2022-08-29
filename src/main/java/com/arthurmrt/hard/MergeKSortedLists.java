package com.arthurmrt.hard;

import com.arthurmrt.ds.ListNode;

//23. Merge k Sorted Lists
public class MergeKSortedLists {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;

        ListNode sentinel = new ListNode();
        ListNode merged = sentinel;

        while (true) {
            //find element with min val
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) continue;
                if (minIndex == -1 || lists[i].val < lists[minIndex].val) {
                    minIndex = i;
                }
            }
            if (minIndex == -1) return sentinel.next;

            // poll min node
            ListNode minNode = null;
            minNode = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;

            // add node to result linked list
            merged.next = minNode;
            merged = merged.next;

        }
    }
}
