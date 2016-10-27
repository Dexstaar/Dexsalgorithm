package com.dexstaar.main;

import com.dexstaar.leetcode.*;

public class LeetCode {
    public static void main(String[] args){




        /*
        //Delete Node In A  Linked List
        // 1 --> 2 --> 3 --> 4
        ListNode head = new ListNode(0);
        ListNode second = new ListNode(1);
        //ListNode third = new ListNode(3);
        //ListNode fourth = new ListNode(4);

        head.next = second;
        //second.next = third;
        //third.next = fourth;

        DeleteNodeInALinkedList deleteNodeInALinkedList = new DeleteNodeInALinkedList();

        ListNode returnedList = deleteNodeInALinkedList.deleteNode(head);

        while(returnedList != null) {
            System.out.print(returnedList.val + " --> ");
            returnedList = returnedList.next;
        }
        */







        //Delete Node At a postion
        //1 --> 2 --> 3 --> 4 --> 5
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        DeleteNodeAtPosition deleteNodeAtPosition = new DeleteNodeAtPosition();

        ListNode returnedList = deleteNodeAtPosition.deleteAtPosition(head, 1);

        while(returnedList != null) {
            System.out.print(returnedList.val + " --> ");
            returnedList = returnedList.next;
        }






        /*

        //RemoveLinkedListElements
        //1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6

        ListNode head = new ListNode(6);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(4);
        ListNode sixth = new ListNode(5);
        ListNode seventh = new ListNode(6);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

        ListNode returnedList = removeLinkedListElements.removeElements(head, 6);

        while(returnedList != null) {
            System.out.print(returnedList.val + " --> ");
            returnedList = returnedList.next;
        }

        */




        /*
        // ReverseLinkedList
        // 1 --> 2 --> 3 --> 4 --> 5 --> null


        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        ReverseLinkedList solution = new ReverseLinkedList();

        ListNode returnedNode = solution.reverseList(head);

        while(returnedNode != null){

            //System.out.println(returnedNode.next.val);
            System.out.print(returnedNode.val + " --> ");
            returnedNode = returnedNode.next;
        }
        */

    }
}
