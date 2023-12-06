package Queue;
class QueueNode { int data; QueueNode next; QueueNode(int a){ data = a; next = null; } }
public class implement_queue_using_linked_list {
    QueueNode front, rear;
	void push(int a) {
	    if(rear == null) {
	        rear = new QueueNode(a);
	        front = rear;
	    }else {
	        rear.next = new QueueNode(a);
	        rear = rear.next;
	    }
	}
	int pop() {
	    if(front == null)
	        return -1;
	    QueueNode temp = front;
	    if(front == rear)
	        rear = null;
	    front = front.next;
	    temp.next = null;
	    return temp.data;
	}
}
