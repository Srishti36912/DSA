package LinkedList.oneD_LinkedList;

class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
public class deleteNodeWithoutHead {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
