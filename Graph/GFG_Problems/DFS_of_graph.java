// Time : O(V + E), Space : O(V)
package Graph.GFG_Problems;
import java.util.*;
public class DFS_of_graph {
    void DFS(ArrayList<ArrayList<Integer>> adj, int s, boolean visited[],
            ArrayList<Integer> ans) {
        visited[s] = true;
        ans.add(s);
        for(int u : adj.get(s)) {
            if(!visited[u]) {
                DFS(adj, u, visited, ans);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[V];
        DFS(adj, 0, visited, ans);
        return ans;
    }
}
