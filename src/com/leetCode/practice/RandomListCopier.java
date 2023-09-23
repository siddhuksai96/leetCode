package com.leetCode.practice;

import com.leetCode.practice.models.Node;

import java.util.HashMap;
import java.util.Map;

public class RandomListCopier {
    Map<Node, Node> newNodeMap = new HashMap<>();

    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        System.out.println("contains="+newNodeMap.containsKey(head));
        if(newNodeMap.containsKey(head))
            return newNodeMap.get(head);
        Node newNode = new Node(head.val);
        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);
        newNodeMap.put(head, newNode);
        return newNode;
    }
}
