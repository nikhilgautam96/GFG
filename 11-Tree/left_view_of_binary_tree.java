// Time : O(n), Space : O(H) --> 'H' can be = 'n' in worst case 
//                      (i.e. for Skewed Binary tree, but this kind of tree is very rare).

package Tree;
import java.util.ArrayList;
public class left_view_of_binary_tree {
    void recursive(Node root, ArrayList<Integer> ans, int level) {
        if(root == null) return;
        if(level == ans.size())
            ans.add(root.data);
        recursive(root.left, ans, level + 1);
        recursive(root.right, ans, level + 1);
    }
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        recursive(root, ans, 0);
        return ans;
    }
}
