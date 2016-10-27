package com.dexstaar.leetcode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode returnedNode = new ListNode(0);
        returnedNode.next = head;
        ListNode current = returnedNode;

        while(current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return returnedNode.next;

    }
}
