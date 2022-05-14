// Time : O(n).
package Tree.Linked_List_and_Binary_Tree;
import java.util.*;

class Node { int data; Node next; Node(int d) { data = d; next = null; }}
class Tree{ int data; Tree left; Tree right; Tree(int d){ data=d; left=null; right=null; }}

public class linked_list_to_binary_tree {
    public static Tree convert(Node head, Tree node) {
        if(head == null)
            return node;
        node = new Tree(head.data);
        Queue<Tree> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            Tree temp = q.poll();
            if(head.next == null)
                break;
            head = head.next;
            temp.left = new Tree(head.data);
            if(head.next == null)
                break;
            head = head.next;
            temp.right = new Tree(head.data);
            q.add(temp.left);
            q.add(temp.right);
        }
        return node;
    }
}
