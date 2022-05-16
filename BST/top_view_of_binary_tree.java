// Time : O(n), Space : O(n).
package BST;
import java.util.*;
public class top_view_of_binary_tree {
    static class pair { Node node; int d; 
        pair(Node n, int t) { node = n; d = t; }
    }
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer, Integer> ts = new TreeMap<>();
        if(root == null) {
            System.out.println();
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        while(!q.isEmpty()) {
            pair temp = q.poll();
            Node n = temp.node;
            int d = temp.d;
            if(!ts.containsKey(d)) {
                ts.put(d, n.data);
            }
            if(n.left != null) {
                q.add(new pair(n.left, d-1));
            }
            if(n.right != null) {
                q.add(new pair(n.right, d+1));
            }
        }
        for(Map.Entry<Integer, Integer> e : ts.entrySet()) {
            ans.add(e.getValue());
        }
        return ans;
    }
}
