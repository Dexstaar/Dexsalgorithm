package com.dexstaar.leetcode;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();

        while(headA != null) {
            hashSet.add(headA.val);
            headA = headA.next;
        }

        while(headB != null) {
            if( hashSet.contains(headB.val) ) {
                return headB;
            } else {
                headB = headB.next;
            }
        }

        return null;
    }
}
