package com.dexstaar.leetcode;

public class DeleteNodeInALinkedList {
    public ListNode deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

        return node;
    }


}
