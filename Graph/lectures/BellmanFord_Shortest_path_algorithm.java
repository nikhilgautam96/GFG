// Time : O(V * E), for complete graph it is - O(n ^ 2)
package Graph.lectures;
import java.util.*;
public class BellmanFord_Shortest_path_algorithm {
    class Edge {
        int u, v, wt;
        Edge(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }
    }
    int[] relaxation(ArrayList<Edge> g, int V, int source) {
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int i = 0; i<V-1; i++) {
            // since at worst case scenario, we require V-1 iteration to update all distances.
            for(Edge e : g) {
                if(dist[e.u] != Integer.MAX_VALUE) {
                    dist[e.v] = Math.min(dist[e.v], dist[e.u] + e.wt);
                }
            }
        }
        // now we perform the N'th relaxation to check for negative cycle.
        for(Edge e : g) {
            if((dist[e.u] != Integer.MAX_VALUE) && (dist[e.u] + e.wt < dist[e.v])) {
                // This means there exists an negative cycle.
                System.out.println("There exists a negative cycle in the graph");
            }
        }
        return dist;
    }
}
