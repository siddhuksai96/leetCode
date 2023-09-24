package com.leetcode.practice.linkedlist;

import com.leetcode.practice.models.ListNode;

public class ListNodeRemover {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && head.val==n))
            return null;
        if(head.next != null && head.val==n)
            return head.next;
        int pos = 0;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            if (slow.next.val == n)
                swap(slow);
            if (fast.val == n)
                swap(fast);
            fast = fast.next.next;
            slow = slow.next;
            pos++;
        }
        return head;
    }

    private void swap(ListNode listNode) {
        if (listNode != null && listNode.next != null) {
            listNode.next = listNode.next.next;
        }
    }
}
