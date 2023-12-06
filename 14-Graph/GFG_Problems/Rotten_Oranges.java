// This problem is same as -> "Distance of nearest cell having 1"
// Time : O(n * m), Space : O(n * m) for the queue.
package Graph.GFG_Problems;
import java.util.*;
public class Rotten_Oranges {
    class Pair {
        int x, y;
        Pair(int x, int y) { this.x = x; this.y = y; }
    }
    int n, m;
    boolean isValid(int ti, int tj) {
        return (ti >= 0 && ti < n && tj >= 0 && tj < m);
    }
    public int orangesRotting(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int time = -1;
        int rotten = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                    grid[i][j] = 0;
                } else if(grid[i][j] == 1) {
                    rotten++;
                }
            }
        }
        int a[] = new int[]{-1, 1, 0, 0};
        int b[] = new int[]{0, 0, -1, 1};
        while(!q.isEmpty()) {
            int len = q.size();
            ++time;
            for(int i = 0; i<len; i++) {
                Pair p = q.poll();
                for(int j = 0; j<4; j++) {
                    int ti = p.x + a[j];
                    int tj = p.y + b[j];
                    if(isValid(ti, tj) && grid[ti][tj] == 1) {
                        q.add(new Pair(ti, tj));
                        grid[ti][tj] = 0;
                        rotten--;
                    }
                }
            }
        }
        if(rotten > 0) return -1;
        return time;
    }
}
