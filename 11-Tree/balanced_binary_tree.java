package Tree;
public class balanced_binary_tree {
    int height(Node root) {
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        if(leftHeight == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight - rightHeight) <= 1)
            return 1 + Math.max(leftHeight, rightHeight);
        return Integer.MAX_VALUE;
    }
    boolean isBalanced(Node root) {
        if(height(root) == Integer.MAX_VALUE)
            return false;
        return true;
    }
}
