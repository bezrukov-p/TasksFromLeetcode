package com.leetcode.solutions;

public class NumberOfMatches {
    public int numberOfMatches(int n) {
        int res = 0;
        int prev = n;
        while (n != 1){
            n /= 2;
            res += prev - n;
            prev = n;
        }
        return res;
    }
}
