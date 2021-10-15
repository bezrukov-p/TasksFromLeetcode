package com.leetcode;

import com.leetcode.solutions.RemoveNthFromEnd;
import com.leetcode.structs.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tmp = head;
        for(int i = 2; i < 6; i++){
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }

        RemoveNthFromEnd sol = new RemoveNthFromEnd();
        sol.removeNthFromEnd(head, 2);
    }
}
