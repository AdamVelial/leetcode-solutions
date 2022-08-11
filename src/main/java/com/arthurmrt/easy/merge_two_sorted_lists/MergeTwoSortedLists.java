package com.arthurmrt.easy.merge_two_sorted_lists;

import java.sql.PreparedStatement;

//21. Merge Two Sorted Lists
public class MergeTwoSortedLists {
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) return list1 == null ? list2 : list1;

        ListNode merge = new ListNode();
        ListNode result = merge;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                merge.next = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                merge.next = list1;
                list1 = list1.next;
            } else {
                if (list1.val < list2.val) {
                    merge.next = list1;
                    list1 = list1.next;
                } else {
                    merge.next = list2;
                    list2 = list2.next;
                }
            }
            merge = merge.next;
            merge.next = null;
        }
        return result.next;
    }
}


