// Time : O(n), Space : O(H).
package Tree;
public class count_subtrees_with_given_sum {
    int count;
    int countTree(Node root, int x) {
        if(root == null)
            return 0;
        int sum = countTree(root.left, x) + countTree(root.right, x) + root.data;
        if(sum == x)
            count++;
        return sum;
    }
    int countSubtreesWithSumX(Node root, int X) {
        // Subtree : Consists of Node and all the descendents of that node.
        count = 0;
        countTree(root, X);
        return count;
    }
}
