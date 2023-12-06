package Tree;
import java.util.*;
public class level_order_traversal_line_by_line {
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            int len = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            while(len-- > 0) {
                Node cur = q.poll();
                temp.add(cur.data);
                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null) {
                    q.add(cur.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
