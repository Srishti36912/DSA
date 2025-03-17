package LinkedList.mediumLL;
class ListNode {
         int val;
         ListNode next;
           ListNode(int x) {
             val = x;
             next = null;
    }
}

public class loopInLL {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;

        if(head == null || head.next == null) {
            return false;
        }

        while(hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(hare == tortoise) {
                return true;
            }
        }
        return false;
    }
}
