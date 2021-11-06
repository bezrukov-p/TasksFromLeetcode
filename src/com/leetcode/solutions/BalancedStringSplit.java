package com.leetcode.solutions;

public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int res = 0;
        for(int i = 0; i < s.length();){
            int count = 0;
            do {
                count = (s.charAt(i) == 'L') ? count + 1 : count - 1;
                i++;
            } while (count != 0);
            res++;
        }
        return res;
    }
}
