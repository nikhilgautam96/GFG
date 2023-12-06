// Time : O(V + E), Space : O(V)
package Graph.lectures;
import java.util.*;
public class detect_cycle_in_an_directed_graph_using_kahns_algo {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) { 
		adj.get(u).add(v); 
	} 
	static void kahnsAlgo(ArrayList<ArrayList<Integer>> adj, int V) { 
        int[] in_degree = new int[V];
        int count = V;
        for (int u = 0; u < V; u++) { 
            for (int x:adj.get(u)) 
                in_degree[x]++; 
        }
        Queue<Integer> q=new LinkedList<>(); 
        for (int i = 0; i < V; i++) 
            if (in_degree[i] == 0) {
                q.add(i);
                count--;
            }
        while (q.isEmpty()==false) { 
            int u = q.poll(); 
            System.out.print(u+" "); 
            for (int x : adj.get(u)) 
                if (--in_degree[x] == 0) {
                    q.add(x);
                    count--;
                }
        }
        if(count > 0) {
            System.out.println("Cycle Found");
            return;
        }
        System.out.println("Cycle Not Found");
    }
	public static void main(String[] args) {  
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

        addEdge(adj,0, 2); 
        addEdge(adj,0, 3); 
        addEdge(adj,1, 3); 
        addEdge(adj,1, 4); 
        addEdge(adj,2, 3);
        kahnsAlgo(adj,V);
	}
}
