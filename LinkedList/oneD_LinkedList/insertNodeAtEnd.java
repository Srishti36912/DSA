package LinkedList.oneD_LinkedList;

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class insertNodeAtEnd {
    Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        
        if(head == null) {
            head = newNode;
            return head;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        
        return head;
    }
}
