package LinkedList;
public class insertion {
    Node insertAtBeginning(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        return head;
    }   
    Node insertAtEnd(Node head, int x) {
        Node start = head;
        if(head == null) {
            return new Node(x);
        }
        while(head.next != null) {
            head = head.next;
        }
        head.next = new Node(x);
        return start;
    }
}
