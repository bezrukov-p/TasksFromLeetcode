package com.leetcode.solutions;

public class DefangIPaddr {
    public String defangIPaddr(String address) {
        String res = "";
        for(int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                res += "[.]";
            else
                res += address.charAt(i);
        }
        return res;
    }
}
