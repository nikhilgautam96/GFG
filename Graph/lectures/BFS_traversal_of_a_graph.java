package Graph.lectures;
import java.util.*;
public class BFS_traversal_of_a_graph {
    void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);

        while(q.isEmpty() == false) {
            int u = q.poll();
            System.out.println(u + " ");
            for(int v : adj.get(u)) {
                if(visited[v] == false) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }
    void BFS_util(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean visited[] = new boolean[V];
        Arrays.fill(visited, false);

        for(int i = 0; i<V; i++) {
            if(visited[i] == false) {
                BFS(adj, i, visited);
            }
        }
    }
}
