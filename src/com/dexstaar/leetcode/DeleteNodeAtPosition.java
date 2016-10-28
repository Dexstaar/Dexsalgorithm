package com.dexstaar.leetcode;

public class DeleteNodeAtPosition {
    public ListNode deleteAtPosition(ListNode head, int position) {
        if(position == 1) {
            head = head.next;
        } else {
            ListNode current = head;

            int count = 1;

            while(count < position - 1) {
                current = current.next;
                count++;
            }

            current.next = current.next.next;
        }

        return head;
    }
}
