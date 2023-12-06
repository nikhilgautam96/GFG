package Tree;

public class max_diff_btwn_node_and_its_ancestor {
    int max;
    int find(Node root) {
        if(root == null)
            return Integer.MAX_VALUE;
        if(root.left == null && root.right == null)
            return root.data;
        int left = find(root.left);
        int right = find(root.right);
        max = Math.max(max, Math.max(root.data - left, root.data - right));
        return Math.min(left, Math.min(root.data, right));
    }
    int maxDiff(Node root) {
        // we assume that all values are Positive;
        // and it is given that there are atleast 2 nodes.
        max = Integer.MIN_VALUE;
        find(root);
        return max;
    }
}
