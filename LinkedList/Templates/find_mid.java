// Tortoise & Hare approach.

package LinkedList.Templates;
class Node {
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}
public class find_mid {
    public Node findMid(Node head) {
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
