// Time : O(V) + O(V + E) + O(V + E) = O(V + E),
// Space : O(V + E) for Transpose graph + O(V) for stack + O(V) for visited array = O(V + E).
package Graph.GFG_Problems;
import java.util.*;
public class Strongly_Connected_Components_Kosarajus_algo {
    Stack<Integer> st;
    void DFS(ArrayList<ArrayList<Integer>> adj, int i, boolean visited[]) {
        visited[i] = true;
        for(int j : adj.get(i)) {
            if(!visited[j]) {
                DFS(adj, j, visited);
            }
        }
        st.push(i);
    }void DFS_SCC(ArrayList<ArrayList<Integer>> transpose, int i, boolean visited[]) {
        visited[i] = true;
        for(int j : transpose.get(i)) {
            if(!visited[j]) {
                DFS_SCC(transpose, j, visited);
            }
        }
    }
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
        st = new Stack<>();
        boolean visited[] = new boolean[V];
        for(int i = 0; i<V; i++) {
            if(!visited[i]) {
                DFS(adj, i, visited);
            }
        }
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for(int i = 0; i<V; i++) {
            transpose.add(new ArrayList<Integer>());
        }
        for(int i = 0; i<V; i++) {
            for(int j : adj.get(i)) {
                transpose.get(j).add(i);
            }
        }
        visited = new boolean[V];
        int count = 0;
        while(!st.isEmpty()) {
            int i = st.pop();
            if(!visited[i]) {
                DFS_SCC(transpose, i, visited);
                count++;
            }
        }
        return count;
    }
}
