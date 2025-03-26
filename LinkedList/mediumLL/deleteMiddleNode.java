package LinkedList.mediumLL;

public class deleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        fast = fast.next.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
}
