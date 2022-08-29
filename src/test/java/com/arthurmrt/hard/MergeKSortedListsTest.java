package com.arthurmrt.hard;

import com.arthurmrt.ds.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

    /**
     * Input: lists = [[1,4,5],[1,3,4],[2,6]]
     * Output: [1,1,2,3,4,4,5,6]
     * Explanation: The linked-lists are:
     * [
     *   1->4->5,
     *   1->3->4,
     *   2->6
     * ]
     * merging them into one sorted list:
     * 1->1->2->3->4->4->5->6
     */
    @Test
    void mergeKListsTest1() {
        ListNode[] list = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6)),
        };

        ListNode exp = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(4,
                                                        new ListNode(5,
                                                                new ListNode(6))))))));

        ListNode result = new MergeKSortedLists().mergeKLists(list);

        while (result != null || exp != null) {
            System.out.println(result.val);
            assertEquals(exp.val, result.val);
            result = result.next;
            exp = exp.next;
        }
    }

    /**
     * Input: lists = []
     * Output: []
     */
    @Test
    void mergeKListsTest2() {
        ListNode[] list = null;

        ListNode result = new MergeKSortedLists().mergeKLists(list);

        assertNull(result);
    }

    /**
     * Input: lists = [[]]
     * Output: []
     */
    @Test
    void mergeKListsTest3() {
        ListNode[] list = new ListNode[]{null, null};

        ListNode result = new MergeKSortedLists().mergeKLists(list);

        assertNull(result);
    }


}