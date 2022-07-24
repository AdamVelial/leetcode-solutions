package com.arthurmrt.easy;

//1672. Richest Customer Wealth
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;

        for(int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            richest = richest < wealth ? wealth : richest;
        }

        return richest;
    }
}
