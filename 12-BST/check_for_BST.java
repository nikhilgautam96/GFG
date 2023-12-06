// Time : O(n), Space : O(n).
package BST;
public class check_for_BST {
    boolean isBSTUtil(Node root, int min, int max) {
        if(root == null)
            return true;
        if(root.data > max || root.data < min)
            return false;
        return (isBSTUtil(root.left, min, root.data) & 
                    isBSTUtil(root.right, root.data, max));
    }
    boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
