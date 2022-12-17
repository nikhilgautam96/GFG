// Time : O(V + E), Space : O(V) - cuz we are doing simple DFS traversal.
package Graph.GFG_Problems;
import java.util.*;
public class Articulation_Point_1 {
    void DFS(int cur, int parent, int timer, boolean visited[], int tin[], int low[], boolean isArticulation[], ArrayList<ArrayList<Integer>> adj) {
        visited[cur] = true;
        tin[cur] = low[cur] = timer++;
        int individualChild = 0;
        for(int it : adj.get(cur)) {
            if(it == parent) continue;
            if(!visited[it]) {
                DFS(it, cur, timer, visited, tin, low, isArticulation, adj);
                low[cur] = Math.min(low[cur], low[it]);
                if(low[it] >= tin[cur] && parent != -1) {
                    isArticulation[cur] = true;
                }
                individualChild++;
            } else {
                // Since this node(the neighbour node) is already visited, it can never be the Articulation point.
                // bcz, we can reach this node even without traversing through the "cur" node.
                low[cur] = Math.min(low[cur], tin[it]);
            }
        }
        if(individualChild > 1 && parent == -1) {
            // This means the starting node is also an articulation point bcz its children dont have a cross edge,
            // or individual childs are not connected.
            isArticulation[cur] = true;
        }
    }
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj) {
        int tin[] = new int[V];
        int low[] = new int[V];
        boolean visited[] = new boolean[V];
        // We use the below array to track articulation point bcz while doing DFS 1 node can become articulation point multiple times
        // so instead of printing everytime we just mark it in an hash array.
        boolean isArticulation[] = new boolean[V];
        int timer = 0;
        for(int i = 0; i<V; i++) {
            if(!visited[i]) {
                DFS(i, -1, timer, visited, tin, low, isArticulation, adj);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<V; i++) {
            if(isArticulation[i]) {
                ans.add(i);
            }
        }
        if(ans.size() == 0) { ans.add(-1); }
        return ans;
    }
}
