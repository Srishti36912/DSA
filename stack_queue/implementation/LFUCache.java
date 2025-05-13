package stack_queue.implementation;

import java.util.HashMap;

public class LFUCache {
    final int capacity;
    int currSize;
    int minFreq;
    HashMap<Integer, Node> cache;
    HashMap<Integer, DLList> freqMap;

    public LFUCache(int capacity) { // constructor
        this.capacity = capacity;
        this.currSize = 0;
        this.minFreq = 0;
        this.cache = new HashMap<>();
        this.freqMap = new HashMap<>();
    }
    
    public int get(int key) { // to get the value of the key
       Node currNode = cache.get(key);
       if(currNode == null) {
            return -1;
       }
       updateNode(currNode);
       return currNode.val;
    }
    
    public void put(int key, int value) { // to add a key-value pair
        if(capacity == 0) {
            return;
        }
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            node.val = value;
            updateNode(node);
        } 
        else {
            currSize++;
            if(currSize > capacity) {
                DLList minFreqList = freqMap.get(minFreq);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                currSize--;
            }
            minFreq = 1;
            Node node = new Node(key, value);
            DLList list = freqMap.getOrDefault(1, new DLList());
            list.addNode(node);
            freqMap.put(1, list);
            cache.put(key, node);
        }
    }
    public void updateNode(Node node) { // to update the frequency of the node
        int freq = node.frequency;
        DLList list = freqMap.get(freq);
        list.removeNode(node);
        if(freq == minFreq && list.listSize == 0) {
            minFreq++;
        }
        node.frequency++;
        DLList newList = freqMap.getOrDefault(node.frequency, new DLList());
        newList.addNode(node);
        freqMap.put(node.frequency, newList);
    }
    class Node {
        int key;
        int val;
        int frequency;
        Node prev;
        Node next;
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.frequency = 1;
        }
    }
    class DLList {
        int listSize;
        Node head;
        Node tail;
        public DLList(){
            this.listSize = 0;
            this.head = new Node(0,0);
            this.tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
        }
        public void addNode(Node node) {
            Node nextNode = head.next;
            node.next = nextNode;
            node.prev = head;
            head.next = node;
            nextNode.prev = node;
            listSize++;
        }
        public void removeNode(Node node) { // to remove a node from the list
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            listSize--;
        }
    }
}
