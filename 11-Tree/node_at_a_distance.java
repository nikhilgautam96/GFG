// Time : O(n), Space : O(H).
package Tree;
public class node_at_a_distance {
    int count;
    void countNodes(Node root, boolean v[], int k, int i) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            if(i >= k && v[i-k] == false) {
                count++;
                v[i-k] = true; // mark it as Visited.
            }
        }
        v[i] = false;
        countNodes(root.left, v, k, i+1);
        countNodes(root.right, v, k, i+1);
    }
    int height(Node root) {
        if(root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    int printKDistantfromLeaf(Node root, int k) {
        int h = height(root);
        boolean v[] = new boolean[h];
        count = 0;
        countNodes(root, v, k, 0);
        return count;
    }
}
