package com.dexstaar.leetcode;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        int halfLength = getLength(head) / 2;
        if (halfLength == 0) return true;

        ListNode current = head;

        int count = 0;
        Stack<Integer> stack = new Stack<Integer>();

        while(current != null) {
            if( count < halfLength ) {
                stack.push(current.val);
            } else {
                if(!stack.isEmpty()) {
                    if(stack.peek() == current.val) {
                        stack.pop();
                    }
                } else {
                    return false;
                }

            }
            current = current.next;
            count++;
        }

        if(stack.isEmpty()) return true;

        return false;

    }

    private int getLength(ListNode head) {
        int count = 1;

        while(head.next != null) {
            count++;
            head = head.next;
        }

        return count;
    }
}
