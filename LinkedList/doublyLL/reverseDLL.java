package LinkedList.doublyLL;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class reverseDLL {
    public DLLNode reverse(DLLNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        DLLNode current = head;
        DLLNode prev = null;
        while(current != null) {
            prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            current = current.prev;
        }
        
        return prev.prev;
        
    }
}
