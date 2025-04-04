package LinkedList.hardLL;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class reverseNodesInKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;

        while(temp != null) {
            ListNode kth = findK(temp, k);
            
            if(kth == null) {
                if(prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }
            ListNode nextNode = kth.next;
            kth.next = null;
            reverse(temp);
            if(temp == head) {
                head = kth;
            } else {
                prevNode.next = kth;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }

    public ListNode findK(ListNode temp, int k) {
        k = k-1;

        while(temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            ListNode front = temp.next;

            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
