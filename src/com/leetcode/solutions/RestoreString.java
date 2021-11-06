package com.leetcode.solutions;

public class RestoreString {
    public String restoreString(String s, int[] indices) {
        StringBuffer resB = new StringBuffer();
        resB.setLength(s.length());
        for(int i = 0; i < indices.length; i++){
            resB.setCharAt(indices[i], s.charAt(i));
        }
        return resB.toString();
    }
}
