package Tree;
import java.util.ArrayList;
public class postorder_traversal {
    public static void postOrderUtil(Node root, ArrayList<Integer> ans) {
        if(root != null) {
            postOrderUtil(root.left, ans);
            postOrderUtil(root.right, ans);
            ans.add(root.data);
        }
    }
    ArrayList<Integer> postOrder(Node root) {
       // PostOrder is (left, right, root).
       ArrayList<Integer> ans = new ArrayList<>();
       postOrderUtil(root, ans);
       return ans;
    }
}
