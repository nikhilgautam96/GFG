package LinkedList;
public class find_length_of_loop_in_linked_list {
    static int countNodesinLoop(Node head) {
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                int len = 1;
                fast = fast.next;
                while(fast != slow) {
                    len++;
                    fast = fast.next;
                }
                return len;
            }
        }
        return 0;
    }
}
