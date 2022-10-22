package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAdSellStockTest {

    /**
     * Example 1:
     *
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     */
    @Test
    void example1() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int maxProfit = new BestTimeToBuyAdSellStock().maxProfit(prices);

        assertEquals(5, maxProfit);
    }

    /**
     *  Example 2:
     *
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transactions are done and the max profit = 0.
     */
    @Test
    void example2() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int maxProfit = new BestTimeToBuyAdSellStock().maxProfit(prices);

        assertEquals(0, maxProfit);
    }


}