package com.leetcode.practice.models;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode loadList(List<Integer> nodes){
        ListNode result;
        for(int node:nodes){
            result = new ListNode(node);
        }
            return null;
    }
}