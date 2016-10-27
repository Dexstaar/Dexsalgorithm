package com.dexstaar.leetcode;

public class DeleteNodeInALinkedList {
    public ListNode deleteNode(ListNode node) {
        int count = 0;
        ListNode current = node;

        while(current.next != null) {
            current = current.next;
            count++;
        }

        return deleteNodeFromLinkedList(node, count);
    }

    private ListNode deleteNodeFromLinkedList(ListNode head, int num) {
        ListNode returnedList = new ListNode(0);
        returnedList.next = head;
        ListNode current = returnedList;

        int count = 0;

        while(count < num) {
            current = current.next;
        }

        current.next = current.next.next;

        return returnedList.next;
    }
}
