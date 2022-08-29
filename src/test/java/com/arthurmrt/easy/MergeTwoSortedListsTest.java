package com.arthurmrt.easy;

import com.arthurmrt.ds.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeTwoSortedListsTest {

    /**
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     */
    @Test
    void mergeTwoListsTest1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode exp = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        ListNode out = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        while (out != null || exp != null) {
            System.out.println(out.val);
            assertEquals(exp.val, out.val);
            out = out.next;
            exp = exp.next;
        }
    }

    /**
     * Input: list1 = [], list2 = []
     * Output: []
     */
    @Test
    void mergeTwoListsTest2() {
        ListNode list1 = null;
        ListNode list2 = null;

        ListNode exp = null;

        ListNode out = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        assertNull(out);
    }

    /**
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     */

    @Test
    void mergeTwoListsTest3() {
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);

        ListNode exp = new ListNode(0);;

        ListNode out = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        assertEquals(exp.val, out.val);
    }

}