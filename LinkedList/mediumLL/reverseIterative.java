package LinkedList.mediumLL;

class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

public class reverseIterative {
    
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while(current != null) {
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
    }
}
