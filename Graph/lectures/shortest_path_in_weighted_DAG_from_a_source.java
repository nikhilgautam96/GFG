// Time : O(V + E), Space : O(V)
// Why this works - Since we have topological sort of the graph we always travel 
//                  to forward direction so the output we have is correct one.
package Graph.lectures;
import java.util.*;
class pair {
    int v, w;
    pair(int v, int w) { this.v = v; this.w = w; }
}
class Graph {
    ArrayList<pair> adj;
    Graph() {
        adj = new ArrayList<pair>();
    }
}
class Shortest_path {
    static Stack<Integer> st = new Stack<>();
    public static void addEdge(Graph g[], int i, int v, int w) {
        pair p = new pair(v, w);
        g[i].adj.add(p);
    }
    public static void shortestPath(int s, Graph g[], int v) {
        int dist[] = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        while(st.isEmpty() == false) {
            int u = st.pop();
            if(dist[u] != Integer.MAX_VALUE) {
                for(pair p : g[u].adj) {
                    dist[p.v] = Math.min(dist[p.v], dist[u] + p.w);
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
    public static void topologicalSort(boolean visited[], Graph g[], int s) {
        visited[s] = true;
        for(pair p : g[s].adj) {
            if(visited[p.v] == false) {
                topologicalSort(visited, g, p.v);
            }
        }
        st.push(s);
    }
    public static void main(String args[]) {
        Graph g[] = new Graph[6];
        for(int i = 0; i<6; i++) {
            g[i] = new Graph();
        }
        addEdge(g, 0, 1, 2);
        addEdge(g, 0, 4, 1);
        addEdge(g, 1, 2, 3);
        addEdge(g, 4, 2, 2);
        addEdge(g, 4, 5, 4);
        addEdge(g, 2, 3, 6);
        addEdge(g, 5, 3, 1);
        boolean visited[] = new boolean[6];
        topologicalSort(visited, g, 0);
        shortestPath(0, g, 6);
    }
}
