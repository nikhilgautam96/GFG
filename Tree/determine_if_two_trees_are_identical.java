package Tree;
public class determine_if_two_trees_are_identical {
    boolean isIdentical(Node root1, Node root2) {
	    if(root1 == null && root2 == null)
	        return true;
	    if(root1 == null || root2 == null || root1.data != root2.data)
	        return false;
	    if(isIdentical(root1.left, root2.left)) 
	        return isIdentical(root1.right, root2.right);
	    return true;
	}
}
