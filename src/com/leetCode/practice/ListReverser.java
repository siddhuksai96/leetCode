package com.leetCode.practice;

import com.leetCode.practice.models.ListNode;
//  https://leetcode.com/problems/reverse-linked-list/
public class ListReverser {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
