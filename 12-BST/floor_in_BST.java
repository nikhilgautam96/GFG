// Time : O(H), Space : O(H)
package BST;
public class floor_in_BST {
    int floor(Node root, int key) {
        if(root == null)
            return -1;
        if(root.data > key)
            return floor(root.left, key);
        if(root.data < key) {
            int rightMax = floor(root.right, key);
            return (rightMax == -1) ? root.data : rightMax;
        }
        return root.data;
    }
}
