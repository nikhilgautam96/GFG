package LinkedList;
class Node {
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}
public class doubly_linked_list_insertion {
    void addNode(Node head_ref, int pos, int data) {
        int count = 0;
        Node start = head_ref;
        while(count < pos) {
            start = start.next;
            count++;
        }
        Node temp = new Node(data);
        if(start.next != null) {
            temp.next = start.next;
            start.next.prev = temp;
        }
        start.next = temp;
        temp.prev = start;
	}
}
