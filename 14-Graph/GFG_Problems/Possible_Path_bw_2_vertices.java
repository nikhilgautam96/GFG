// Time : O(V!) If the graph is complete then there can be around N! recursive calls, 
// Space : O(V) for recursion stack and visited[] array.
package Graph.GFG_Problems;
import java.util.*;
public class Possible_Path_bw_2_vertices {
    int DFS(ArrayList<ArrayList<Integer>> adj, int i, int d, boolean visited[], int count) {
        visited[i] = true;
        if(i == d) {
            count++;
        } else {
            for(int j : adj.get(i)) {
                if(!visited[j]) {
                    count = DFS(adj, j, d, visited, count);
                }
            }
        }
        visited[i] = false;
        return count;
    }
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                   int destination) {
        int count = 0;
        boolean visited[] = new boolean[V];
        count = DFS(adj, source, destination, visited, count);
        return count;
    }
}
