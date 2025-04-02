package LinkedList.mediumDLL;

public class deleteOccurences {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;
        
        while(temp != null) {
            if(temp.data == x) {
                if(temp == head) {
                    head = temp.next;
                }
                if(temp.prev != null) {
                    
                temp.prev.next = temp.next;
                
                } 
                if(temp.next != null) {
                    
                temp.next.prev = temp.prev;
                
                }
                temp = temp.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
