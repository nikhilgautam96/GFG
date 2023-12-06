package LinkedList;
public class reverse_a_linked_list {
    Node reverseList(Node head) {
        if(head == null || head.next == null)
            return head;
        Node cur = head, prev = null;
        while(cur != null) {
            // prev = cur;
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
