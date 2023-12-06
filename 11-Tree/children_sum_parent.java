package Tree;
public class children_sum_parent {
    public static int isSumProperty(Node root) {
        if(root == null || (root.left == null && root.right == null))
            return 1;
        int sum = ((root.left != null) ? root.left.data : 0) + 
                        ((root.right != null) ? root.right.data : 0);
        if(root.data == sum) {
            int ans = 1 & isSumProperty(root.left);
            if(ans == 1) {
                return isSumProperty(root.right);
            }
        }
        return 0;
    }
}
