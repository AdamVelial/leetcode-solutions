package com.arthurmrt.easy;


// 121. Best Time to Buy and Sell Stock
public class BestTimeToBuyAdSellStock {

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     *
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     *
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */
    public int maxProfit(int[] prices) {

        int maxProfit = 0, left = 0, right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
