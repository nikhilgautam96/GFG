package Graph.lectures;
import java.util.*;
public class count_number_of_islands {
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

        int counter = 0;
        for(int i = 0; i<V; i++) {
            if(visited[i] == false) {
                DFS(adj, i, visited);
                counter++;
            }
        }
        System.out.println("Number of islands are " + counter);
    }
}
