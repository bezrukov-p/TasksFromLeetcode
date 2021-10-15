package com.leetcode.solutions;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] counts = new int[101];
        for(int elem : nums){
            counts[elem]++;
        }
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < nums[i]; j++){
                sum += counts[j];
            }
            res[i] = sum;
        }
        return res;
    }
}
