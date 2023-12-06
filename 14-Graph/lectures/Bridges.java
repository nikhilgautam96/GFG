// Time : O(V + E), Space : O(V)
package Graph.lectures;
import java.util.*;
public class Bridges {
    void DFS(int cur, int parent, int timer, int tin[], int low[], boolean visited[], ArrayList<ArrayList<Integer>> adj) {
        visited[cur] = true;
        tin[cur] = low[cur] = timer++;

        for(int it : adj.get(cur)) {
            if(it == parent) continue;
            if(!visited[it]) {
                DFS(it, cur, parent, tin, low, visited, adj);
                low[cur] = Math.min(low[cur], low[it]);
                if(low[it] > tin[cur]) {
                    System.out.println("Bridge between - "+cur+" : "+it);
                }
            }else {
                low[cur] = Math.min(low[cur], tin[it]);
            }
        }
    }
    void find_bridge(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean visited[] = new boolean[V];
        int tin[] = new int[V];
        int low[] = new int[V];
        int timer = 0;
        for(int i = 0; i<V; i++) {
            if(!visited[i]) {
                DFS(i, -1, timer, tin, low, visited, adj);
            }
        }
    }
}
