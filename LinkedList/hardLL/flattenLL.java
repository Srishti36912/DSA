package LinkedList.hardLL;

public class flattenLL {
    Node flatten(Node root) {
        if(root == null || root.next == null) {
            return root;
        }
        
        Node mergeRoot = flatten(root.next);
        return merge(root, mergeRoot);
    }
    
    Node merge(Node head, Node mergeHead) {
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        
        while(head != null && mergeHead != null) {
            if(head.data < mergeHead.data) {
                res.bottom = head;
                res = head;
                head = head.bottom;
            } else {
                res.bottom = mergeHead;
                res = mergeHead;
                mergeHead = mergeHead.bottom;
            }
            res.next = null;
        }
        if(head != null) {
            res.bottom = head;
        } else {
            res.bottom = mergeHead;
        }
        
        return dummyNode.bottom;
    }
}
