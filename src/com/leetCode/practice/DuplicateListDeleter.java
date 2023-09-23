package com.leetCode.practice;

import com.leetCode.practice.models.ListNode;

public class DuplicateListDeleter {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }
}
