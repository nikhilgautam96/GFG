package LinkedList;
public class rotate_a_linked_list {
    public Node rotate(Node head, int k) {
        Node cur = head, end = null;
        for(int i = 1; i<k; i++) {
            cur = cur.next;
        }
        if(cur.next == null)
            return head;
        end = cur;
        while(end != null && end.next != null) {
            end = end.next;
        }
        Node temp = cur.next;
        cur.next = null;
        end.next = head;
        return head = temp;
    }
}
