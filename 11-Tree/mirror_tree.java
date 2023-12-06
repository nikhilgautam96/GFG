// Time : O(n), Space O(H) : size of recursion stack in both methods.
package Tree;
public class mirror_tree {
    // Method 1
    // void mirror(Node node) {
    //     if(node != null) {
    //         mirror(node.left);
    //         mirror(node.right);
    //         Node temp = node.left;
    //         node.left = node.right;
    //         node.right = temp;
    //     }
    // }
    
    // Method 2
    Node convert(Node root) {
        if(root == null)
            return null;
        Node left = convert(root.left);
        Node right = convert(root.right);
        
        root.left = right;
        root.right = left;
        
        return root;
    }
    void mirror(Node node) {
        convert(node);
    }
}
