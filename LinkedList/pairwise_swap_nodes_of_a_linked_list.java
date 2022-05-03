package LinkedList;
public class pairwise_swap_nodes_of_a_linked_list {
    public static Node pairwise_swap(Node node) {
        Node prev = node, cur = node.next;
        // Node temp1 = cur.next;
        node = cur;
        while(cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            if(temp == null || temp.next == null) {
                prev.next = temp;
                break;
            }
            prev.next = temp.next;
            prev = temp;
            cur = temp.next;
        }
        return node;
    }
}
