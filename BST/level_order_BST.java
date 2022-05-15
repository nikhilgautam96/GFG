// Time: O(n)
package BST;
import java.util.*;
public class level_order_BST {
    static ArrayList<Integer> levelOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(node == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            ans.add(temp.data);
        }
        return ans;
    }
}
