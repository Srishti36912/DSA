package LinkedList.mediumLL;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class sortLL {
    // sorting linked list using merge sort
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return sortedLL(left, right);
    }

    public ListNode findMiddle(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode sortedLL(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummy.next;
    }
}
