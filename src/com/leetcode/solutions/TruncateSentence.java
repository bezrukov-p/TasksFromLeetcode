package com.leetcode.solutions;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuffer res = new StringBuffer("");
        for(int i = 0; i < k - 1; i++)
            res.append(words[i]).append(" ");
        res.append(words[k - 1]);
        return res.toString();
    }
}
