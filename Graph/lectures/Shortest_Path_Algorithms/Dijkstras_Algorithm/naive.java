// Time : theta(V ^ 2), Space : O(V)
package Graph.lectures.Shortest_Path_Algorithms.Dijkstras_Algorithm;
import java.util.*;
public class naive {
    int [] dijkstra(int src, int graph[][], int V) {
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        boolean visited[] = new boolean[V];
        for(int count = 0; count<V-1; count++) {
            int u = -1;
            for(int i = 0; i<V; i++) {
                if(!visited[i] && (u == -1 || dist[i] < dist[u])) {
                    u = i;
                }
            }
            visited[u] = true;
            for(int i = 0; i<V; i++) {
                if(!visited[i] && graph[u][i] != 0) {
                    // There is an edge to "i'th" vertex from "u'th" vertex
                    dist[i] = Math.min(dist[i], dist[u] + graph[u][i]);
                }
            }
        }
        return dist;
    }
}
