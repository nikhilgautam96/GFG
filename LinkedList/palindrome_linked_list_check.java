package LinkedList;
public class palindrome_linked_list_check {
    Node reverseList(Node head) {
        Node cur = head, prev = null;
        while(cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse the second half of the List.
        mid.next = reverseList(mid.next);
        // now we start comparing.
        Node left = head, right = mid.next;
        while(left != null && right != null) {
            if(left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
