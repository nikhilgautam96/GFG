package LinkedList;
public class Add_2_numbers_using_linked_list {
    static Node addTwoLists(Node first, Node second){
        Node cur = first, prev = null;
        while(cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        first = prev;
        cur = second; prev = null;
        while(cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        second = prev;
        
        Node res = null, resHead = null;
        int carry = 0;
        while(first != null && second != null) {
            int sum = (first.data + second.data + carry);
            carry = 0;
            if(sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            }
            Node temp = new Node(sum);
            if(resHead == null) {
                resHead = res = temp;
            }else {
                res.next = temp;
                res = res.next;
            }
            first = first.next;
            second = second.next;
        }
        while(first != null) {
            int sum = (first.data + carry);
            carry = 0;
            if(sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            }
            Node temp = new Node(sum);
            if(resHead == null) {
                resHead = res = temp;
            }else {
                res.next = temp;
                res = res.next;
            }
            first = first.next;
        }
        while(second != null) {
            int sum = (second.data + carry);
            carry = 0;
            if(sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            }
            Node temp = new Node(sum);
            if(resHead == null) {
                resHead = res = temp;
            }else {
                res.next = temp;
                res = res.next;
            }
            second = second.next;
        }
        while(carry != 0) {
            int sum = carry % 10;
            Node temp = new Node(sum);
            if(resHead == null) {
                resHead = res = temp;
            }else {
                res.next = temp;
                res = res.next;
            }
            carry /= 10;
        }
        cur = resHead; prev = null;
        while(cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return resHead = prev;
    }
}
