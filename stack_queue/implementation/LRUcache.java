package stack_queue.implementation;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node next;
    Node prev;
    public Node(int _key, int _value) {
        key = _key;
        value = _value;
    }
}

public class LRUcache {
    HashMap<Integer, Node> mpp = new HashMap<>();
    int capacity;
    Node head = new Node(0,0), tail = new Node(0,0);

    public LRUCache(int _capacity) {
        capacity = _capacity;
        mpp.clear();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(mpp.containsKey(key)) {
            Node node = mpp.get(key);
            deleteNode(node);
            insertAfterHead(node);
            return node.value;
        } 
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)) {
            Node node = mpp.get(key);
            deleteNode(node);
        }
        if(mpp.size() == capacity) {
            Node node = tail.prev;
            deleteNode(node);
        }
        Node node = new Node(key, value);
        insertAfterHead(node);
    }
    private void deleteNode(Node node) {
        mpp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insertAfterHead(Node node) {
        mpp.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}
