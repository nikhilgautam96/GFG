package LinkedList;
public class merge_k_sorted_linked_list {
    Node mergeKList(Node[]arr, int K) {
        Node root = arr[0];
        for(int i = 1; i<K; i++) {
            root = sortedMerge(root, arr[i]);
        }
        return root;
    }
    Node sortedMerge(Node head1, Node head2) {
        Node root = new Node(-1);
        Node head = root;
        while(head1 != null || head2 != null) {
            if(head1 == null) {
                root.next = head2;
                head2 = head2.next;
            }else if(head2 == null) {
                root.next = head1;
                head1 = head1.next;
            }else if(head1.data < head2.data) {
                root.next = head1;
                head1 = head1.next;
            }else {
                root.next = head2;
                head2 = head2.next;
            }
            root = root.next;
        }
        return head.next;
    }
}
