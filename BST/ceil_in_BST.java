// Time : O(H), Space : O(H)
package BST;
public class ceil_in_BST {
    int findCeil(Node root, int key) {
        if(root == null) return -1;
        if(root.data > key) {
            int leftMin = findCeil(root.left, key);
            return (leftMin == -1) ? root.data : leftMin;
        }
        if(root.data < key) {
            return findCeil(root.right, key);
        }
        return root.data;
    }
}
