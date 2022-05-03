// Floyd's Tortoise and Hare Algorithm: Finding a Cycle in a Linked List
package LinkedList.Templates;
public class find_loop {
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