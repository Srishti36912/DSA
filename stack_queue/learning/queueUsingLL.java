package stack_queue.learning;

public class queueUsingLL {
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode q = new QueueNode(a);
        if(front == null) {
            front = q;
            rear = q;
        } else {
            rear.next = q;
            rear = q;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front == null) {
            return -1;
        } else {
            int el = front.data;
            front = front.next;
            return el;
        }
	}
}
