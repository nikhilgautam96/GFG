// Using DFS based recursive approach.
// Time : O(V + E), SPACE : O(V)
package Graph.GFG_Problems;
import java.util.*;
public class Topological_sort {
    static Stack<Integer> st;
    static void DFS(ArrayList<ArrayList<Integer>> adj, int i, boolean visited[]) {
        visited[i] = true;
        for(int j : adj.get(i)) {
            if(!visited[j]) {
                DFS(adj, j, visited);
            }
        }
        st.push(i);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        st = new Stack<>();
        boolean visited[] = new boolean[V];
        for(int i = 0; i<V; i++) {
            if(!visited[i]) {
                DFS(adj, i, visited);
            }
        }
        int ans[] = new int[V];
        int i = 0;
        while(!st.isEmpty()) {
            ans[i++] = st.pop();
        }
        return ans;
    }
}
