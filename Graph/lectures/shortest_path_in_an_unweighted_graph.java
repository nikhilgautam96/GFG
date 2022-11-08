// Time : O(V + E)
// Note : In an Unweighted graph, BFS always gives the shortest distance.
package Graph.lectures;
import java.util.*;
public class shortest_path_in_an_unweighted_graph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) { 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	}
	static void shortestPathBFS(ArrayList<ArrayList<Integer>> adj, int V, int s, int[] dist) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        dist[s] = 0;
        while(!(q.isEmpty())) {
            int v = q.poll();
            for(int u : adj.get(v)) {
                if(visited[u] == false) {
                    dist[u] = dist[v] + 1;
                    visited[u] = true;
                    q.add(u);
                }
            }
        }
	}
	public static void main(String[] args) {  
		int V = 4; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,0,1); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,3);
        int[] dist=new int[V];
        for(int i=0;i<V;i++){
            dist[i] = Integer.MAX_VALUE;
        }
    	shortestPathBFS(adj,V,0,dist); 
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
	} 
}
