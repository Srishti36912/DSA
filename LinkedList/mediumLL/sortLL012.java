package LinkedList.mediumLL;

public class sortLL012 {
    static Node segregate(Node head) {
        // add your code here
        if(head == null || head.next == null) {
            return head;
        }
        
        Node zero = new Node(-1);
        Node ones = new Node(-1);
        Node two = new Node(-1);
        Node zeroHead = zero;
        Node onesHead = ones;
        Node twoHead = two;
        Node temp = head;
        
        while(temp != null) {
            if(temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1) {
                ones.next = temp;
                ones = ones.next;
            }
            else {
                two.next = temp;
                two = two.next;
            }
            
            temp = temp.next;
        }
        
        two.next = null;
        
        if(onesHead.next != null) {
            zero.next =  onesHead.next; 
        } else {
            zero.next =  twoHead.next;
        }
        
        if (twoHead.next != null) {
            ones.next = twoHead.next;
        } else {
            ones.next = null;
        }
        
        twoHead.next = null;
        
        return zeroHead.next;
    }
}
