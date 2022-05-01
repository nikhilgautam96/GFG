package LinkedList;
import java.util.HashSet;
public class remove_duplicate_from_unsorted_list {
    public Node removeDuplicates(Node head) {
         // Your code here
         HashSet<Integer> hs = new HashSet<Integer>();
         Node cur = head, prev = null;
         while(cur != null) {
             int data = cur.data;
             if(hs.contains(data)) {
                //  delete this node.
                prev.next = cur.next;
                cur.next = null;
                cur = prev;
             }else {
                 hs.add(data);
             }
             prev = cur;
             cur = cur.next;
         }
         return head;
    }
}
