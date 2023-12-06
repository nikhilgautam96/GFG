// Floyd's Tortoise and Hare Algorithm: Finding a Cycle in a Linked List
package LinkedList;
public class detect_loop_in_a_linked_list {
    public static boolean detectLoop(Node head){
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true; // cycle found.
            }
        }
        return false; // cycle not found.
    }
}
