// Time : O(H), Space : O(H)
package BST;
public class delete_node_from_BST {
    static int inOrderSuccessor(Node root) {
        if(root.left == null)
            return root.data;
        return inOrderSuccessor(root.left);
    }
    public static Node deleteNode(Node root, int X) {
        if(root == null)
            return root;
        if(X < root.data)
            root.left = deleteNode(root.left, X);
        else if(X > root.data)
            root.right = deleteNode(root.right, X);
        else {
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            root.data = inOrderSuccessor(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
}
