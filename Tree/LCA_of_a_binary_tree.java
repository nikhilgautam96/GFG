// Time : O(n), Space : O(H).

package Tree;
public class LCA_of_a_binary_tree {
    Node lca(Node root, int n1, int n2) {
	    if(root == null || root.data == n1 || root.data == n2)
	        return root;
	    Node left = lca(root.left, n1, n2);
	    Node right = lca(root.right, n1, n2);
	    
	    if(left == null) {
	       // nothing found on left side.
	       return right; // returns value returned from right side (null | found)
	    }
	    if(right == null) {
	       // if(left != null) check if(right == null) --> "yes" return "left".
	        return left;
	    }
        // else neither are null, i.e. both "n1, n2" was found.
        // So, just return this Node as this is the lowest|Deppest level 
        // where they both were discovered for the 1st time.
        return root;
	}
}
