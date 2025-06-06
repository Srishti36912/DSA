package LinkedList.mediumDLL;

public class removeDuplicatesFromDLL {
    Node removeDuplicates(Node head){
        Node temp = head.next;
        
        if(head == null || head.next == null) {
            return head;
        }
        
        while(temp != null) {
            if(temp.prev.data == temp.data) {
                temp.prev.next = temp.next;
                
                if(temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
