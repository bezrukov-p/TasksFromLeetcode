package com.leetcode.solutions;

import java.util.HashMap;

public class CountKDifference {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> numshash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            if (numshash.containsKey(nums[i] + k))
                count += numshash.get(nums[i] + k);
            if (numshash.containsKey(nums[i] - k))
                count += numshash.get(nums[i] - k);
            res += count;
            if (numshash.containsKey(nums[i]))
                numshash.put(nums[i], numshash.get(nums[i]) + 1);
            else
                numshash.put(nums[i], 1);
        }
        return res;
    }
}
