package LinkedList.mediumDLL;

import java.util.ArrayList;

public class findPairsWithSum {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node left = head;
        Node right = findTail(head);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        if(head == null) {
            return null;
        }
        
        while(left.data < right.data) {
            if(left.data + right.data == target) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(left.data);
                list.add(right.data);
                arr.add(list);
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return arr;
    }
    
    public static Node findTail(Node head) {
        Node tail = head;
        
        while(tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }
}
