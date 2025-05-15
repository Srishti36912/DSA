package LinkedList.doublyLL;

class Node {
    int data;
    Node prev;
    Node next;
    Node(int d)  { 
        data = d;  
        prev = null; 
        next = null; 
    }
}

public class arrToDLL {
    Node constructDLL(int arr[]) {
        Node head = new Node(arr[0]);
        
        Node temp = head;
        temp.prev = null;
        
        for(int i=1; i<arr.length; i++) {
            Node current = new Node(arr[i]);
            current.prev = temp;
            temp.next = current;
            temp = current;
        }
        return head;
    }
}
