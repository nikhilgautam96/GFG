// Time: O(n), Space : O(H)
package BST;
import java.util.*;
class Node{ int data; Node left, right; Node(int d){ data=d; left=right=null; }}
public class inorder_BST {
    ArrayList<Integer> ans = new ArrayList<>();
    ArrayList<Integer> inOrder(Node root) {
        if(root == null) {
            return ans;
        }
        inOrder(root.left);
        ans.add(root.data);
        inOrder(root.right);
        return ans;
    }
}
