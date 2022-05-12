// Time : O(n), Space : O(H) --> 'H' can be = 'n' in worst case.
package Tree;
import java.util.ArrayList;
public class right_view_of_binary_tree {
    void recursive(Node root, ArrayList<Integer> ans, int level) {
        if(root == null) return;
        if(level == ans.size())
            ans.add(root.data);
        recursive(root.right, ans, level + 1);
        recursive(root.left, ans, level + 1);
    }
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        recursive(node, ans, 0);
        return ans;
    }
}
