// Time : O(n), Space : O(H) - recursion stack.
package Tree;
public class max_sum_of_non_adjacent_nodes {
    static class pair { int include, exclude; pair() { include = exclude = 0; } }
    static pair getMax(Node root) {
        if(root == null) {
            return new pair();
        }
        pair left = getMax(root.left);
        pair right = getMax(root.right);
        pair temp = new pair();
        // Sum including node at current level.
        temp.include = left.exclude + right.exclude + root.data;
        // Sum excluding node at current level.
        temp.exclude = Math.max(left.include, left.exclude) + 
                            Math.max(right.include, right.exclude);
        return temp;
    }
    static int getMaxSum(Node root) {
        pair ans = getMax(root);
        return Math.max(ans.include, ans.exclude);
    }
}
