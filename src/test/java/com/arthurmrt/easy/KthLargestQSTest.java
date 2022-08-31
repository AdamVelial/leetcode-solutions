package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestQSTest {
    /**
     * Input
     * ["KthLargest", "add", "add", "add", "add", "add"]
     * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
     * Output
     * [null, 4, 5, 5, 8, 8]
     *
     * Explanation
     * KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
     * kthLargest.add(3);   // return 4
     * kthLargest.add(5);   // return 5
     * kthLargest.add(10);  // return 5
     * kthLargest.add(9);   // return 8
     * kthLargest.add(4);   // return 8
     */
    @Test
    void test1() {
        KthLargestQS kthLargest = new KthLargestQS(3, new int[]{4, 5, 8, 2});

        assertEquals( 4, kthLargest.add(3));
        assertEquals( 5, kthLargest.add(5));
        assertEquals( 5, kthLargest.add(10));
        assertEquals( 8, kthLargest.add(9));
        assertEquals( 8, kthLargest.add(4));
    }

    @Test
    void test2() {
        KthLargestQS kthLargest = new KthLargestQS(1, new int[]{});

        //expected [null,-3,-2,-2,0,4]

        assertEquals( -3 ,kthLargest.add(-3));
        assertEquals( -2 ,kthLargest.add(-2));
        assertEquals( -2 ,kthLargest.add(-4));
        assertEquals( 0 ,kthLargest.add(0));
        assertEquals( 4 ,kthLargest.add(4));
    }

    @Test
    void test3() {
        KthLargestQS kthLargest = new KthLargestQS(1, new int[]{-2});

        assertEquals( -2 ,kthLargest.add(-3));
        assertEquals( 0 ,kthLargest.add(0));
        assertEquals( 2 ,kthLargest.add(2));
        assertEquals( 2 ,kthLargest.add(2));
        assertEquals( 4 ,kthLargest.add(4));
    }
}