// Time : O(E * Log E), Space O(V)
// Using Disjoint-Set
package Graph.lectures.Minimum_Spanning_Tree_Algorithms;
import java.util.*;
public class Kruskals_Algo {
    class Edge implements Comparable<Edge> {
        int src, dest, wt;
        Edge(int s, int d, int w) {
            src = s; dest = d; wt = w;
        }
        public int compareTo(Edge e) {
            return this.wt - e.wt;
        }
    }
    int parent[], rank[];
    int find(int x) {
        if(parent[x] == x) {
            return x;
        }
        parent[x] = find(parent[x]);
        return parent[x];
    }
    void union(int x, int y) {
        int x_rep = find(x), y_rep = find(y);
        if(x_rep == y_rep) return;
        if(rank[x_rep] < rank[y_rep]) {
            parent[x_rep] = y_rep;
        } else if(rank[x_rep] > rank[y_rep]) {
            parent[y_rep] = x_rep;
        } else {
            parent[y_rep] = x_rep;
            rank[x_rep]++;
        }
    }
    int kruskals(Edge arr[], int V) {
        Arrays.sort(arr);
        parent = new int[V];
        rank = new int[V];
        for(int i = 0; i<V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        int res = 0;
        Edge output[] = new Edge[V-1]; // to store the edges in MST;
        for(int i = 0, s = 0; s < V-1; i++) {
            Edge e = arr[i];
            int x_rep = find(e.src), y_rep = find(e.dest);
            if(x_rep != y_rep) {
                //it means the 2 edges does not belong to same set, hence it wont form a cycle.
                res += e.wt;
                output[s] = e;
                union(x_rep, y_rep);
                s++;
            }
        }
        return res;
    }
}
