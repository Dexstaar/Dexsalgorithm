package com.dexstaar.algorithm.linkedlist;

public class SinglyLinkedList {
    private ListNode head;          // Head node to hold the list

    // It contains a static inner class ListNode
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // 10 -> 8 -> 1 -> 11 -> null
        // 10 as head of linked list

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        head.next = second;     // 10 -> 8
        second.next = third;    // 8 -> 1
        third.next = fourth;    // 1 -> 11

    }
}
