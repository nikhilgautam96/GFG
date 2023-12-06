package LinkedList;
class Node {
    int data;
    Node next, prev;
    Node(int data) { this.data = data; next = prev = null; }
}
public class merge_sort_doubly_linked_list {
    static Node sortDoubly(Node head) {
        if(head == null || head.next == null)
            return head;
        Node mid = findMid(head);
        Node left = head, right = mid.next;
        mid.next = null;
        
        left = sortDoubly(left);
        right = sortDoubly(right);
        
        return sortedMerge(left, right);
    }
    static Node findMid(Node head) {
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node sortedMerge(Node head1, Node head2) {
        Node root = new Node(-1);
        Node head = root;
        while(head1 != null || head2 != null) {
            if(head1 == null) {
                root.next = head2;
                head2.prev = root;
                head2 = head2.next;
            }else if(head2 == null) {
                root.next = head1;
                head1.prev = root;
                head1 = head1.next;
            }else if(head1.data < head2.data) {
                root.next = head1;
                head1.prev = root;
                head1 = head1.next;
            }else {
                root.next = head2;
                head2.prev = root;
                head2 = head2.next;
            }
            root = root.next;
        }
        head.next.prev = null;
        return head.next;
}
