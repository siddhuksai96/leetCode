package com.leetcode.practice;

import com.leetcode.practice.models.ListNode;

public class ListAdder {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int k = l2 != null ? l2.val : 0;
            int j = l1 != null ? l1.val : 0;
            int sum = k + j + carry;
            carry = sum / 10;
            sum = sum % 10;

            dummy.next = new ListNode(sum);
            dummy = dummy.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListAdder instance = new ListAdder();
        ListNode listNode = instance.addTwoNumbers(l1, l2);
        System.out.println("1");
    }
}
