package LinkedList;
public class sort_0_1_2_in_linked_list {
    static Node segregate(Node head) {
        Node zeroTail = new Node(-1), oneTail = new Node(-1), twoTail = new Node(-1);
        Node zeroHead = zeroTail, oneHead = oneTail, twoHead = twoTail;
        while(head != null) {
            if(head.data == 0) {
                zeroTail.next = head;
                zeroTail = head;
            }else if(head.data == 1) {
                oneTail.next = head;
                oneTail = head;
            }else {
                twoTail.next = head;
                twoTail = head;
            }
            head = head.next;
        }
        if(oneHead.next != null) {
            zeroTail.next = oneHead.next;
            oneTail.next = twoHead.next;
        } else {
            zeroTail.next = twoHead.next;
        }
        twoTail.next = null;
        return zeroHead.next;
    }
}
