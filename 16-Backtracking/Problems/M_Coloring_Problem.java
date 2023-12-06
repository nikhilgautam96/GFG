// Time : O(M ^ (N * N))
package Backtracking.Problems;
import java.util.*;
public class M_Coloring_Problem {
    boolean isSafe(int i, boolean graph[][], int k, int col[], int n, int m) {
        for(int j = 0; j<n; j++) {
            if(graph[i][j]) {
                if(col[j] == k) {
                    return false;
                }
            }
        }
        return true;
    }
    boolean color(int i, boolean graph[][], int col[], int n, int m) {
        if(i == n) {
            return true;
        }
        for(int k = 1; k<=m; k++) {
            if(isSafe(i, graph, k, col, n, m)) {
                col[i] = k;
                if(color(i+1, graph, col, n, m)) {
                    return true;
                }
                col[i] = 0;
            }
        }
        return false;
    }
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int col[] = new int[n];
        Arrays.fill(col, 0);
        return color(0, graph, col, n, m);
    }
}
