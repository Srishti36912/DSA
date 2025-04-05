package LinkedList.hardLL;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class rotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int len = 1;
        while(temp.next != null) {
            len++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % len;
        int end = len - k;
        while(end-- != 0) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
