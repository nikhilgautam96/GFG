package Graph.lectures;
import java.util.*;
public class DFS_traversal_of_a_graph {
    void DFS(ArrayList<ArrayList<Integer>> adj, int s, boolean visited[]) {
        visited[s] = true;
        System.out.println(s + " ");

        for(int u : adj.get(s)) {
            if(visited[u] == false)
                DFS(adj, u, visited);
        }
    }
    void DFS_util(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean visited[] = new boolean[V];
        Arrays.fill(visited, false);

        for(int i = 0; i<V; i++) {
            if(visited[i] == false) {
                DFS(adj, i, visited);
            }
        }
    }
}
