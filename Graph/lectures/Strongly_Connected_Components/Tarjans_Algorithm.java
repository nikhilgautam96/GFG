// Time : O(V + E) and 1 traversal of the graph
package Graph.lectures.Strongly_Connected_Components;
import java.util.*;
public class Tarjans_Algorithm {
    void DFS(int cur, int timer, int tin[], int low[], boolean inStack[], Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        tin[cur] = low[cur] = timer++;
        st.push(cur);
        inStack[cur] = true;
        for(int it : adj.get(cur)) {
            if(tin[cur] == -1) {
                // this neighbour has not been visited/explored yet.
                DFS(it, timer, tin, low, inStack, st, adj);
                low[cur] =  Math.min(low[cur], low[it]);
            } else if(inStack[cur]) {
                // if the neighbour is visited and in the stack then it is a "Back Edge".
                low[cur] = Math.min(low[cur], tin[it]);
            }
            // else if neighbour is visited and not present in stack 
            // then it is a "Cross Edge", hence we ignore it.
        }
        // after exploring all the neighbours, 
        // we check if this node is the "head of a Strongly Connected Component".
        if(low[cur] == tin[cur]) {
            // This means the "cur" node is the head of a "SCC"
            int node;
            do {
                node = st.pop();
                System.out.print(node + " ");
                inStack[node] = false;
            } while(node != cur);
        }
    }
    void Tarjans(ArrayList<ArrayList<Integer>> adj, int V) {
        int tin[] = new int[V];
        int low[] = new int[V];
        boolean inStack[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(tin, -1);
        Arrays.fill(low, -1);
        int timer = 0;  
        for(int i = 0; i<V; i++) {
            if(tin[i] == -1) {
                DFS(i, timer, tin, low, inStack, st, adj);
            }
        }
    }
}
