package LinkedList.oneD_LinkedList;

class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

public class lengthOfLL {
    public int getCount(Node head) {
        // code here
        int cnt = 1;
        if(head == null) {
            return 0;
        }
        
        Node current = head;
        while(current.next != null) {
            cnt++;
            current = current.next;
        }
        
        return cnt;
    }
}
