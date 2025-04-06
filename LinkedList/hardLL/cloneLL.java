package LinkedList.hardLL;

public class cloneLL {
    public Node copyRandomList(Node head) {
        insertNodes(head);
        connectRandom(head);
        return connectNext(head);
    }
    public void insertNodes(Node head) {
        Node temp = head;

        while(temp != null) {
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
    }
    public void connectRandom(Node head) {
        Node temp = head;

        while(temp != null) {
            Node copyNode = temp.next;
            if(temp.random != null) {
                copyNode.random = temp.random.next;
            } else {
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
    }
    public Node connectNext(Node head) {
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        Node temp = head;

        while(temp != null) {
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }
        return dummyNode.next;
    }
}
