// We have used "Kahn's BFS based algorithm"
// Time : O(V + E), Space : O(v)
package Graph.GFG_Problems;
import java.util.*;
public class detect_cycle_in_a_directed_graph {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int inDegree[] = new int[V];
        int count = V;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<V; i++) {
            for(int j : adj.get(i)) {
                inDegree[j]++;
            }
        }
        for(int i = 0; i<V; i++) {
            if(inDegree[i] == 0) {
                count--;
                q.add(i);
            }
        }
        while(!q.isEmpty()) {
            int i = q.poll();
            for(int j : adj.get(i)) {
                if(--inDegree[j] == 0) {
                    q.add(j);
                    count--;
                }
            }
        }
        if(count > 0) {
            return true;
        }
        return false;
    }
}
