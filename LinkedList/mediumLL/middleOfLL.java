package LinkedList.mediumLL;

class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     
public class middleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;

        while(hare != null && tortoise != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }

        return tortoise;
    }
}
