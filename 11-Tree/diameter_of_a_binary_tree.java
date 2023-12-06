// Time : O(n), Space : O(H) for Recursion stack.
package Tree;
public class diameter_of_a_binary_tree {
    int maxDiameter;
    int height(Node root) {
        if(root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        maxDiameter = Math.max(maxDiameter, left + right + 1);
        return 1 + Math.max(left, right);
    }
    int diameter(Node root) {
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }
}
