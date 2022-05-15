// Time : O(n + m), Space : O(n) - for storing elements of first tree in HashMap.
package BST;
import java.util.*;
public class find_common_nodes_in_two_BST {
    public static void traverse(Node root, LinkedHashSet<Integer> hs) {
	    if(root == null) {
	        return;
	    }
	    traverse(root.left, hs);
	    hs.add(root.data);
	    traverse(root.right, hs);
	}
	public static void check(Node root, LinkedHashSet<Integer> hs, ArrayList<Integer> ans) {
	    if(root == null) {
	        return;
	    }
	    check(root.left, hs, ans);
	    if(hs.contains(root.data)) {
	        ans.add(root.data);
	    }
	    check(root.right, hs, ans);
	}
	public static ArrayList<Integer> findCommon(Node root1, Node root2) {
	    ArrayList<Integer> ans = new ArrayList<>();
        if(root1 == null || root2 == null)
            return ans;
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        traverse(root1, hs);
        check(root2, hs, ans);
        return ans;
    }
}
