package LinkedList;
public class swap_kth_nodes_from_ends {
    Node swapkthnode(Node head, int num, int K) {
        if(K > num || K == num - K + 1)
            return head;
        Node beg = head, end = head, beg_prev = null, end_prev = null;
        for(int i = 1; i<K; i++) {
            beg_prev = beg;
            beg = beg.next;
        }
        for(int i = 1; i<num-K+1; i++) {
            end_prev = end;
            end = end.next;
        }
        if(beg_prev != null)
            beg_prev.next = end;
        if(end_prev != null)
            end_prev.next = beg;
        Node temp = beg.next;
        beg.next = end.next;
        end.next = temp;
        if(K == 1)
            return end;
        if(K == num)
            return beg;
        return head;
    }
}
