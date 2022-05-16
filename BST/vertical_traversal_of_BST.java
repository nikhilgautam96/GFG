// Time : O(n), Space : O(n).
package BST;
import java.util.*;
public class vertical_traversal_of_BST {
    static class pair {
        Node node; int level;
        pair(Node node, int level) { this.node = node; this.level = level; }
    }
    static ArrayList <Integer> verticalOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Queue<pair> q = new LinkedList<>();
        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
        q.add(new pair(root, 0));
        while(!q.isEmpty()) {
            pair temp = q.poll();
            int d = temp.level;
            if(tm.containsKey(d) == true) {
                ArrayList<Integer> al = tm.get(d);
                al.add(temp.node.data);
                tm.put(d, al);
            }else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(temp.node.data);
                tm.put(d, al);
            }
            if(temp.node.left != null) {
                pair p = new pair(temp.node.left, d-1);
                q.add(p);
            }
            if(temp.node.right != null) {
                pair p = new pair(temp.node.right, d+1);
                q.add(p);
            }
        }
        for(Map.Entry<Integer, ArrayList<Integer>> e : tm.entrySet()) {
            ArrayList<Integer> a = e.getValue();
            for(int x : a) {
                ans.add(x);
            }
        }
        return ans;
    }
}
