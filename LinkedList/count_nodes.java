package LinkedList;
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}
public class count_nodes {
    public static int getCount(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
