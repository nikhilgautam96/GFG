package LinkedList;
public class remove_duplicate_from_sorted_list {
    Node removeDuplicates(Node head) {
        Node root = head;
        while(head != null) {
            if(head.next != null && head.data == head.next.data) {
                Node temp = head.next;
                head.next = temp.next;
                temp.next = null;
            }else {
                head = head.next;
            }
        }
        return root;
    }
}
