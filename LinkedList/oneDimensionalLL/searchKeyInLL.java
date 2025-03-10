package LinkedList.oneDimensionalLL;

class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }
public class searchKeyInLL {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node current = head;
        
        for(int i=0; i<n; i++) {
            if(current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
