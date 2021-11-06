package com.leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i = 1; i < candies.length; i++){
            max = Math.max(candies[i], max);
        }
        List<Boolean> res = new LinkedList<>();
        for(int i = 0; i < candies.length; i++)
            res.add(max <= candies[i] + extraCandies);
        return res;
    }
}
