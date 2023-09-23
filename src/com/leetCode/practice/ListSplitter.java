package com.leetcode.practice;

import com.leetcode.practice.models.ListNode;
import java.lang.Math;
public class ListSplitter {
    int listLength = 0;

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode current = head;

        while (current != null) {
            current = current.next;
            listLength++;
        }
        current = head;
        ListNode[] nodeList = new ListNode[k];
        for (int i = 0; i < k; i++) {
            nodeList[i] = splitList(current, k);
        }
        return nodeList;
    }

    private ListNode splitList(ListNode current, int k) {
        ListNode result = current;
        int splitSize = (int) Math.ceil(listLength / k);
        System.out.println(current.val);
        for (int i = 0; i < splitSize; i++) {
            result = result.next;
            current = current.next;
        }
        listLength -= splitSize;
        result.next = null;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Math.ceil((double)3/5));
    }
}