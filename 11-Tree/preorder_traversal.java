package Tree;
import java.util.*;
class Node{ int data; Node left, right; Node(int d){ data=d; left=right=null; }}
public class preorder_traversal {
    public static void pre(Node root, ArrayList<Integer> ans) {
        if(root != null) {
            ans.add(root.data);
            pre(root.left, ans);
            pre(root.right, ans);
        }
    }
    static ArrayList<Integer> preorder(Node root) {
        // Preorder is (root, left, right).
        ArrayList<Integer> ans = new ArrayList<Integer>();
        pre(root, ans);
        return ans;
    }
}
