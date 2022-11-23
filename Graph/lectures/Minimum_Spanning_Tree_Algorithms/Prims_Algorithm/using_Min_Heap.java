// Time : O((V + E) log V), Space : O(V + E)
package Graph.lectures.Minimum_Spanning_Tree_Algorithms.Prims_Algorithm;
import java.util.*;
public class using_Min_Heap {
    static class Edge {
        int v, wt;
        Edge(int v, int wt) {
            this.v = v; this.wt = wt;
        }
    }
    static class Pair implements Comparable<Pair> {
        int u, v, wt;
        Pair(int u, int v, int wt) {
            this.u = u; this.v = v; this.wt = wt;
        }
        public int compareTo(Pair p) {
            return this.wt - p.wt;
        }
    }
    static int prims(ArrayList<Edge> g[], int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        // First we add the 'Starting Vertex' or '0' into the priority queue.
        // the cost of reaching source is always '0'.
        pq.add(new Pair(-1, 0, 0));
        boolean visited[] = new boolean[V];
        int res = 0, count = V;
        while(!pq.isEmpty() && count > 0) {
            Pair temp = pq.remove();
            if(!visited[temp.v]) {
                // if vertex "v" is not yet visited.
                visited[temp.v] = true;
                res += temp.wt;
                for(Edge e : g[temp.v]) {
                    // This step seems like it will take O(V * E) time when combined with the outer loop but,
                    // it actually take O(E) total time as there are E Edges to traverse in total.
                    if(!visited[e.v]) {
                        pq.add(new Pair(temp.v, e.v, e.wt));
                    }
                }
                count--;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        ArrayList<Edge> g[] = new ArrayList[V];
        for(int i = 0; i<V; i++) {
            g[i] = new ArrayList<Edge>();
        }
        int edges = sc.nextInt();
        while(edges-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();
            g[u].add(new Edge(v, wt));
            g[v].add(new Edge(u, wt));
        }
        System.out.println("MST Cost is : " + prims(g, V));
    }
}
