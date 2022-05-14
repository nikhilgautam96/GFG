package Tree;
public class maximum_path_sum_from_any_node {
    int maxSum;
    int find(Node root) {
        if(root == null)
            return 0;
        int leftSum = find(root.left);
        int rightSum = find(root.right);
        int sum = Math.max(root.data, Math.max(leftSum+root.data, rightSum+root.data));
        maxSum = Math.max(maxSum, Math.max(sum, leftSum + rightSum + root.data));
        return sum;
    }
    int findMaxSum(Node node) {
        maxSum = Integer.MIN_VALUE;
        find(node);
        return maxSum;
    }
}
