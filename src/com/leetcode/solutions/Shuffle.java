package com.leetcode.solutions;

public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;
        for(;i < n && j < 2*n; i++, j++, k+=2){
            res[k] = nums[i];
            res[k + 1] = nums[j];
        }
        return res;
    }
}
