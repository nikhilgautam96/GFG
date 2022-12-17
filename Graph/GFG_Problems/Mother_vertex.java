// Time : O(V + E), Space : O(V)
package Graph.GFG_Problems;
import java.util.*;
public class Mother_vertex {
    void DFS(ArrayList<ArrayList<Integer>> adj, int i, boolean visited[]) {
        visited[i] = true;
        for(int j : adj.get(i)) {
            if(!visited[j]) {
                DFS(adj, j, visited);
            }
        }
    }
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj) {
        boolean visited[] = new boolean[V];
        int ans = -1;
        for(int i = 0; i<V; i++) {
            if(!visited[i]) {
                DFS(adj, i, visited);
                ans = i;
            }
        }
        visited = new boolean[V];
        DFS(adj, ans, visited);
        for(boolean i : visited) {
            if(!i) {
                // if there is an unvisited node, then we have no mother vertex.
                return -1;
            }
        }
        return ans;
    }
}
