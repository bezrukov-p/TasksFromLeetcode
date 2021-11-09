package com.leetcode.solutions;

import java.util.Arrays;

public class MinMovesToSeat {
    public int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0; i < students.length; i++)
            res += Math.abs(seats[i] - students[i]);
        return res;
    }
}
