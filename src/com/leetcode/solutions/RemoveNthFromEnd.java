package com.leetcode.solutions;

import com.leetcode.structs.ListNode;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = head;
        int size = 0;
        while(tmp != null){
            size++;
            tmp = tmp.next;
        }
        if (n == size)
            return head.next;

        int indRemove = size - n;
        tmp = head;

        for(int i = 0; i < indRemove - 1; i++){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return head;
    }
}
