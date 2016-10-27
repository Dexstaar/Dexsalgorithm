// https://youtu.be/jY-EUKXYT20

package com.dexstaar.leetcode;


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
