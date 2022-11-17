// Time : Theta(V ^ 2)
package Graph.lectures.Prims_Algorithm;
import java.util.*;
public class naive {
    int prims(int graph[][], int V) {
        int res = 0;
        int minWeight[] = new int[V];
        Arrays.fill(minWeight, Integer.MAX_VALUE);
        boolean mSet[] = new boolean[V];
        minWeight[0] = 0; // starting vertex.

        for(int i = 0; i<V; i++) {
            // Finding the minimum weight edge.
            int u = -1;
            for(int j = 0; j<V; j++) {
                if(!mSet[j] && (u == -1 || minWeight[u] > minWeight[j])) {
                    u = j;
                }
            }
            // Updating the distance of all adjacents of 'U'.
            mSet[u] = true;
            res += minWeight[u];
            for(int j = 0; j<V; j++) {
                if(graph[u][j] != 0 && !mSet[j]) {
                    minWeight[j] = Math.min(minWeight[j], graph[u][j]);
                }
            }
        }
        return res;
    }
}
