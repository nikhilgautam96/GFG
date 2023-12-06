// Time: O(H), Space : O(H)
package BST;
public class search_node_in_BST {
    boolean search(Node root, int x) {
        if(root == null)
            return false;
        return (root.data == x) || search(root.left, x) || search(root.right, x);
    }
}
