package LinkedList;
public class nth_node_from_end_of_linked_list {
    int getNthFromLast(Node head, int n) {
        Node fast = head, slow = head;
        while(fast != null && n>1) {
            fast = fast.next;
            n--;
        }
        if(fast == null)
            return -1;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
