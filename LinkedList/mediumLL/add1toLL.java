package LinkedList.mediumLL;

public class add1toLL {
    public Node addOne(Node head) {
        // code here.
        int carry = helper(head);
        if(carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
    
    public int helper(Node temp) {
        if(temp == null) {
            return 1;
        }
        int carry = helper(temp.next);
        temp.data = temp.data + carry;
        if(temp.data < 10) {
            return 0;
        }
        temp.data = 0;
        return 1;
    }
}
