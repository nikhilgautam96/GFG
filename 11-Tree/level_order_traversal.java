package Tree;
import java.util.*;
public class level_order_traversal {
    static ArrayList <Integer> levelOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            Node cur = q.poll();
            ans.add(cur.data);
            if(cur.left != null) {
                q.add(cur.left);
            }
            if(cur.right != null) {
                q.add(cur.right);
            }
        }
        return ans;
    }
}
