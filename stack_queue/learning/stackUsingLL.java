package stack_queue.learning;

public class stackUsingLL {
     // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode el = new StackNode(a);
        el.next = top;
        top = el;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(top == null) {
          return -1;
        }
        int topData = top.data;
        StackNode temp = top;
        top = top.next;
        return topData;
    }
}
