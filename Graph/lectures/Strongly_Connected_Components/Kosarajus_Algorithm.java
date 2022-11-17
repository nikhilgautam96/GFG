// Time : O(V) + O(V + E) + O(V + E) = O(V + E),
// Space : O(V + E) for Transpose graph + O(V) for stack + O(V) for visited array = O(V + E).
package Graph.lectures.Strongly_Connected_Components;
import java.util.*;
public class Kosarajus_Algorithm {
    void DFS(int cur, boolean visited[], Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        visited[cur] = true;
        for(int it : adj.get(cur)) {
            if(!visited[it]) {
                DFS(it, visited, st, adj);
            }
        }
        st.push(cur);
    }
    void DFS_SCC(int cur, boolean visited[], ArrayList<ArrayList<Integer>> transpose) {
        visited[cur] = true;
        System.out.print(cur+" ");
        for(int it : transpose.get(cur)) {
            if(!visited[cur]) {
                DFS_SCC(it, visited, transpose);
            }
        }
    }
    void kosarajus(ArrayList<ArrayList<Integer>> adj, int V) {
        // First we do Topological Sort of the given graph.
        boolean visited[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i<V; i++) {
            if(!visited[i]) {
                DFS(i, visited, st, adj);
            }
        }
        // now that we have the Topological sort order of the graph, 
        // we reverse the graph.
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<V; i++) {
            transpose.add(new ArrayList<Integer>());
        }
        for(int i = 0; i<V; i++) {
            for(int it : adj.get(i)) {
                transpose.get(it).add(i);
            }
        }
        Arrays.fill(visited, false);
        // now that we have transposed the graph,
        // we need to traverse the transposed graph in the sorted order.
        // every DFS traversal will give 1-SCC.
        while(!st.isEmpty()) {
            int head = st.pop();
            if(!visited[head]) {
                DFS_SCC(head, visited, transpose);
                System.out.println();
            }
        }
    }
}
