package LinkedList.mediumLL;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class lengthLoop {
    public int length(Node tortoise, Node hare) {
        int counter = 1;
        
        hare = hare.next;
        
        while(hare != tortoise) {
                    hare = hare.next;
                    counter++;
        }
        return counter;
    }
    public int countNodesinLoop(Node head) {
        // Add your code here.
        
        Node tortoise = head;
        Node hare = head;
        
        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
            
            if(hare == tortoise) {
                return length(tortoise, hare);
            }
        }
        return 0;
    }
}
