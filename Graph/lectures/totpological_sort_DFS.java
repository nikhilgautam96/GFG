// Topological Sort can only be done in Directed Acyclic Graphs.
// Time : O(V + E), Space : O(V) if we use stack for storing resultant order,
//                                otherwise the recursion stack is only used.
package Graph.lectures;
import java.util.*;
public class totpological_sort_DFS {
    static Stack<Integer> st = new Stack<>();
    public static void DFS_topological_sort(ArrayList<ArrayList<Integer>> g, 
                    boolean visited[], int s) {
        visited[s] = true;
        for(int u : g.get(s)) {
            if(!visited[u]) {
                DFS_topological_sort(g, visited, u);
            }
        }
        st.push(s);
    }
    public static void main(String[] args) {  
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

        addEdge(adj,0, 1); 
        addEdge(adj,1, 3); 
        addEdge(adj,2, 3); 
        addEdge(adj,3, 4); 
        addEdge(adj,2, 4); 
		boolean visited[] = new boolean[V];
		System.out.println("Following is a Topological Sort of"); 
        for(int i = 0; i<V; i++) {
            if(visited[i] == false) {
                DFS_topological_sort(adj, visited, i);
            }
        }
        while (st.isEmpty() == false) 
            System.out.print(st.pop() + " "); 
	} 
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) { 
		adj.get(u).add(v); 
	} 
}
