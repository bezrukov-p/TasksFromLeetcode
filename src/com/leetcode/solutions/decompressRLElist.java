package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class decompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i += 2){
            int freq = nums[i];
            int val = nums[i + 1];
            for(int j = 0; j < freq; j++)
                res.add(val);
        }
        int[] resint = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            resint[i] = res.get(i);
        return resint;
    }
}
