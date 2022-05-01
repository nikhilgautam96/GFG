package LinkedList;
public class merge_two_sorted_linked_list {
    Node sortedMerge(Node head1, Node head2) {
        Node root = null;
        if(head1.data < head2.data) {
            root = head1;
            head1 = head1.next;
            root.next = null;
        }else {
            root = head2;
            head2 = head2.next;
            root.next = null;
        }
        Node head = root;
        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                root.next = head1;
                head1 = head1.next;
            }else {
                root.next = head2;
                head2 = head2.next;
            }
            root = root.next;
        }
        while(head1 != null) {
            root.next = head1;
            head1 = head1.next;
            root = root.next;
        }
        while(head2 != null) {
            root.next = head2;
            head2 = head2.next;
            root = root.next;
        }
        return head;
   } 
}