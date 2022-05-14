package Tree;
import java.util.*;
class Node{
    int data; Node left; Node right; Node nextRight;
    Node(int data){ this.data = data; left=null; right=null; nextRight = null; }
}
public class connect_nodes_at_same_level {
    public void connect(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            int len = q.size();
            Node prev = null;
            for(int i = 0; i<len; i++) {
                Node cur = q.poll();
                if(prev == null) {
                    prev = cur;
                }else {
                    prev.nextRight = cur;
                    prev = cur;
                }
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right !=  null)
                    q.add(cur.right);
            }
            prev.nextRight = null;
        }
    }
}
