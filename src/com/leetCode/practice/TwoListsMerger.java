package com.leetcode.practice;

import com.leetcode.practice.models.ListNode;

public class TwoListsMerger {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode dummy = new ListNode(-1);
        ListNode result = dummy;
        while (list1 != null || list2 != null) {
            if ((list1 == null && list2 != null) || (list1 != null && list2 != null && list1.val >= list2.val)) {
                list2 = mergeListNode(list2, dummy);
            } else if ((list1 != null && list2 == null) || (list1 != null && list2 != null && list2.val > list1.val)) {
                list1 = mergeListNode(list1, dummy);
            }
            dummy = dummy.next;
        }
        return result.next;
    }

    private static ListNode mergeListNode(ListNode temp, ListNode result) {
        result.next = temp;
        temp = temp.next;
        result.next.next = null;
        return temp;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        TwoListsMerger instance = new TwoListsMerger();
        ListNode listNode = instance.mergeTwoLists(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
