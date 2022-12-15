// Time : O(V + E), Space : O(V)
package Graph.GFG_Problems;
import java.util.*;
public class detect_cycle_in_undirected_graph {
    boolean DFS(ArrayList<ArrayList<Integer>> adj, int i, int p, boolean visited[]) {
        visited[i] = true;
        for(int j : adj.get(i)) {
            if(!visited[j]) {
                if(DFS(adj, j, i, visited)) {
                    return true;
                }
            } else if(j != p) {
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        for(int i = 0; i<V; i++) {
            if(!visited[i]) {
                if(DFS(adj, i, -1, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
