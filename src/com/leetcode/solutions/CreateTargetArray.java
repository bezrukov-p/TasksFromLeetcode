package com.leetcode.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> target = new LinkedList<>();
        target.add(nums[0]);
        for(int i = 1; i < nums.length; i++)
            target.add(index[i],nums[i]);
        int[] res = new int[target.size()];
        for(int i = 0; i < target.size(); i++)
            res[i] = target.get(i);
        return res;
    }
}
