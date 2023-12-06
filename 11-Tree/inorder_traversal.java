package Tree;
import java.util.ArrayList;
public class inorder_traversal {
    public static void inOrderUtil(Node root, ArrayList<Integer> ans) {
        if(root != null) {
            inOrderUtil(root.left, ans);
            ans.add(root.data);
            inOrderUtil(root.right, ans);
        }
    }
    ArrayList<Integer> inOrder(Node root) {
        // Inorder is (left, root, right).
        ArrayList<Integer> ans = new ArrayList<>();
        inOrderUtil(root, ans);
        return ans;
    }
}
