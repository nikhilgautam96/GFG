// This problem uses - "Multisource BFS Algorithm"
// Time : O(n * m), Space : O(n * m)
package Graph.GFG_Problems;
import java.util.*;
public class Distance_of_nearest_cell_having_1 {
    class Pair {
        int x, y;
        Pair(int x, int y) { this.x = x; this.y = y; }
    }
    int n, m;
    boolean isValid(int ti, int tj) {
        return (ti >= 0 && ti < n && tj >= 0 && tj < m);
    }
    public int[][] nearest(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int level = 0;
        boolean visited[][] = new boolean[n][m];
        int ans[][] = new int[n][m];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(grid[i][j] == 1) {
                    q.add(new Pair(i, j));
                    visited[i][j] = true;
                }
            }
        }
        int a[] = new int[]{-1, 1, 0, 0};
        int b[] = new int[]{0, 0, -1, 1};
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i<len; i++) {
                Pair p = q.poll();
                ans[p.x][p.y] = level;
                for(int j = 0; j<4; j++) {
                    int ti = p.x + a[j];
                    int tj = p.y + b[j];
                    if(isValid(ti, tj) && !visited[ti][tj]) {
                        q.add(new Pair(ti, tj));
                        visited[ti][tj] = true;
                    }
                }
            }
            level++;
        }
        return ans;
    }
}
