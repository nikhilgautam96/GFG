package Tree;
public class foldable_binary_tree {
    boolean check(Node h1, Node h2) {
        if(h1 == null && h2 == null)
            return true;
        if(h1 == null || h2 == null)
            return false;
        return check(h1.left, h2.right) & check(h1.right, h2.left);
    }
    boolean IsFoldable(Node node) { 
        return (node == null) || check(node.left, node.right);
	}
}
