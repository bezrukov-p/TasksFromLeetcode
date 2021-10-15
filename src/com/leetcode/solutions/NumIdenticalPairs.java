package com.leetcode.solutions;

public class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if (arr[nums[i]] > 0)
                res += arr[nums[i]];
            arr[nums[i]]++;
        }

        return res;
    }
}
