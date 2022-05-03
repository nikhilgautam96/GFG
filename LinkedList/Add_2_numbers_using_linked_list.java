package LinkedList;
public class Add_2_numbers_using_linked_list {
    static Node reverseList(Node head) {
        Node cur = head, prev = null;
        while(cur != null) {
            // prev = cur;
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    static Node addTwoLists(Node first, Node second) {
        first = reverseList(first);
        second = reverseList(second);
        Node res = null, dummy = new Node(0);
        res = dummy;
        int carry = 0;
        while(first != null || second != null || carry != 0) {
            int sum = 0;
            if(first != null)
                sum += first.data;
            if(second != null)
                sum += second.data;
            sum += carry;
            carry = 0;
            if(sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            }
            Node temp = new Node(sum);
            res.next = temp;
            res = res.next;
            if(first != null)
                first = first.next;
            if(second != null)
                second = second.next;
        }
        Node head = dummy.next;
        dummy.next = null;
        head = reverseList(head);
        return head;
    }
}
