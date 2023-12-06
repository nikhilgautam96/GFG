package LinkedList;
public class insert_in_mid_of_linked_list {
    public Node insertInMid(Node head, int data) {
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = new Node(data);
        temp.next = slow.next;
        slow.next = temp;
        return head;
    }
}
