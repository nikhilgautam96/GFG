package LinkedList;
public class remove_loop_in_a_linked_list {
    public static void removeLoop(Node head){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                // we found a loop.
                // now we need to get the start and end position of loop to point it to null.
                slow = head;
                if(fast == head) {
                    // This means the loop starts at the Head of the List.
                    fast = fast.next;
                    while(fast.next != slow) {
                        fast = fast.next;
                    }
                }else {
                    while(slow.next != fast.next) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                }
                fast.next = null;
            }
        }
    }
}
