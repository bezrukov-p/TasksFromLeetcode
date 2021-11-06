package com.leetcode.solutions;

public class Interpret {
    public String interpret(String command) {
        String res = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) != '(' && command.charAt(i) != ')')
                res += command.charAt(i);
            else
                if (command.charAt(i) == '(' && i != command.length() - 1 && command.charAt(i + 1) == ')') {
                    res += "o";
                    i++;
                }
        }
        return res;
    }
}
