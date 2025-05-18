package LinkedList.doublyLL;

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}

public class insertNodeAtK {
    Node addNode(Node head, int p, int x) {
        Node newNode = new Node(x);
        Node current = head;
        int i = 0;
        
        if(head == null) {
            return newNode;
        }
        
        while(current.next != null && i<p) {
                i++;
                current = current.next;
        }
        
        if(current == null) {
            return head;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        
        return head;
    }
}
