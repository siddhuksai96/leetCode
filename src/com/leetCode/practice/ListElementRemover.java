package com.leetcode.practice;

import com.leetcode.practice.models.ListNode;

//  https://leetcode.com/problems/remove-linked-list-elements/
public class ListElementRemover {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) {
            head = head.next;
            return removeElements(head, val);
        } else
            head.next = removeElements(head.next, val);
        return head;
    }

//    public static void main(String[] args) {
//        removeElements();
//    }
}
