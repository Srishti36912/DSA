package LinkedList.doublyLL;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class deleteInDLL {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head == null) {
            return null;
        }
        
        if(x == 1) {
            head = head.next;
            if(head != null)
            head.prev = null;
            
            return head;
        }
        
        Node current = head;
        int i=1;
        
        while(current.next != null && i<x) {
            i++;
            current = current.next;
        }
        
        if(current == null) {
            return head;
        }
        
        current.prev.next = current.next;
        if(current.next != null)
        current.next.prev = current.prev;
        
        return head;
    }
}
