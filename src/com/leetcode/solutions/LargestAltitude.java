package com.leetcode.solutions;

public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            high += gain[i];
            max = Math.max(max, high);
        }
        return max;
    }
}
