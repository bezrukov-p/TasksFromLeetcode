package com.leetcode.solutions;

public class Maximum69Number {
    public int maximum69Number (int num) {
        int count = 0;
        int tmp = num;
        while (tmp != 0){
            tmp /= 10;
            count++;
        }

        int digit;
        tmp = num;
        while (count != 0){
            digit = (int)(tmp / Math.pow(10, count - 1));
            if (digit == 6)
                return num + 3 * (int)Math.pow(10, count - 1);
            tmp %= (int)Math.pow(10, count - 1);
            count--;
        }
        return num;
    }
}
