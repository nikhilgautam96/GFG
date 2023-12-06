// Time : O(n), Space : O(n) + O(n)
package Tree;
import java.util.*;
public class zig_zag_traversal {
    ArrayList<Integer> zigZagTraversal(Node root) {
	    ArrayList<Integer> ans = new ArrayList<>();
	    Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();
	    s1.push(root);
	    while(!s1.isEmpty() || !s2.isEmpty()) {
	        while(!s1.isEmpty()) {
	            Node temp = s1.pop();
	            ans.add(temp.data);
	            if(temp.left != null)
	                s2.push(temp.left);
	            if(temp.right != null)
	                s2.push(temp.right);
	        }
	        while(!s2.isEmpty()) {
	            Node temp = s2.pop();
	            ans.add(temp.data);
	            if(temp.right != null)
	                s1.push(temp.right);
	            if(temp.left != null)
	                s1.push(temp.left);
	        }
	    }
	    return ans;
	}
}
