package com.zwx.learn.algorithm.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: LRULinkedNode
 * Project: learn-algorithm
 * Description:
 * Date: 2020/5/23 21:49
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
 *
 * @author wxzhao
 * @version 1.0
 */
public class LRULinkedNode {
    private int capacity = 16;
    private int count = 0;
    private Map<String, Node> map = new HashMap<>();
    private Node head = null;
    private Node tail = null;

    public LRULinkedNode(int capacity) {
        this.capacity = capacity;
    }

    public void put(String key, Object value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.obj = value;
            updateTail(node);
            updateNode(node);
            updateHead(node);
        } else {
            Node node = new Node(value);
            if (count < capacity) {
                if (head == null) {
                    head = tail = node;
                } else {
                    updateHead(node);
                }
            } else {
                updateTail(tail);
                updateHead(node);
            }
            map.put(key, node);
            count++;
        }
    }

    public void delete(String key) {
        if (!map.containsKey(key)) return;
        Node node = map.get(key);
        updateTail(node);
        map.remove(key);
        if (count > 0) count--;
    }

    public Object get(String key) {
        if (!map.containsKey(key)) return null;
        Node node = map.get(key);
        updateNode(node);
        updateHead(node);
        return node.obj;
    }

    private void updateTail(Node node) {
        if (tail == node) {
            tail = tail.prev;
            tail.next = null;
        }
    }

    private void updateNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;
    }

    private void updateHead(Node node) {
        head.prev = node;
        node.next = head;
        head = node;
    }

    private class Node {
        public Object obj;
        public Node next;
        public Node prev;

        public Node(Object obj) {
            this.obj = obj;
        }
    }
}
