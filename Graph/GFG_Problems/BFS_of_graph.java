// Time : O(V + E), Space : O(V)
package Graph.GFG_Problems;
import java.util.*;
public class BFS_of_graph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()) {
            int u = q.poll();
            ans.add(u);
            for(int v : adj.get(u)) {
                if(!visited[v]) {
                    q.add(v);
                    visited[v] = true;
                }
            }
        }
        return ans;
    }
}
