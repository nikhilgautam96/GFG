// Time: O(H), Space : O(H)
package BST;
public class insert_node_in_BST {
    Node insert(Node root, int Key) {
        if(root == null) {
            return new Node(Key);
        }
        if(Key == root.data)
            return root;
        if(Key < root.data)
            root.left = insert(root.left, Key);
        else
            root.right = insert(root.right, Key);
        return root;
    }
}
