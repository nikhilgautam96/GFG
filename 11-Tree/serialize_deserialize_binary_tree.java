// Time : O(n)
package Tree;
import java.util.*;
public class serialize_deserialize_binary_tree {
    public void serialize(Node root, ArrayList<Integer> A) {
	    if(root == null) {
	        A.add(-1);
	        return;
	    }
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    A.add(root.data);
	    while(!q.isEmpty()) {
	        Node temp = q.poll();
	        if(temp.left == null) {
	            A.add(-1);
	        }else {
	            q.add(temp.left);
	            A.add(temp.left.data);
	        }
	        if(temp.right == null) {
	            A.add(-1);
	        }else {
	            q.add(temp.right);
	            A.add(temp.right.data);
	        }
	    }
	}
    public Node deSerialize(ArrayList<Integer> A) {
        if(A.get(0) == -1)
            return null;
        Node head = new Node(A.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(head);
        int i = 1;
        while(!q.isEmpty() && i < A.size()) {
            Node temp = q.poll();
            if(A.get(i) == -1) {
                temp.left = null;
            }else {
                temp.left = new Node(A.get(i));
                q.add(temp.left);
            }
            i++;
            if(A.get(i) == -1) {
                temp.right = null;
            }else {
                temp.right = new Node(A.get(i));
                q.add(temp.right);
            }
            i++;
        }
        return head;
    }
}
