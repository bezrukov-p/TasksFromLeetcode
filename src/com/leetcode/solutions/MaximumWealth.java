package com.leetcode.solutions;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int wealthMax = -1;
        for(int i = 0; i < accounts.length; i++){
            int customerWealth = 0;
            for(int j = 0; j < accounts[i].length; j++)
                customerWealth+=accounts[i][j];
            wealthMax = Math.max(customerWealth, wealthMax);
        }
        return wealthMax;
    }
}
