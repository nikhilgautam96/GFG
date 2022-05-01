package LinkedList;
public class delete_without_head_pointer {
    void deleteNode(Node del) {
        Node prev = null;
        while(del.next != null) {
            del.data = del.next.data;
            prev = del;
            del = del.next;
        }
        prev.next = null;
    }
}
