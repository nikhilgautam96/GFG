package Graph.GFG_Problems;
import java.util.*;
public class level_of_nodes {
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        if(X >= V) return -1;
        int level[] = new int[V];
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int j : adj.get(cur)) {
                if(!visited[j]) {
                    visited[j] = true;
                    level[j] = level[cur] + 1;
                    q.add(j);
                }
            }
        }
        return level[X];
    }
}
