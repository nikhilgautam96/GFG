// Time : O(n * m), Space : O(n * m)
package Graph.GFG_Problems;
public class X_total_shapes {
    int n, m;
    int x[] = new int[] {1, -1, 0, 0};
    int y[] = new int[] {0, 0, 1, -1};
    boolean isSafe(int ti, int tj) {
        return (ti >= 0 && ti < n && tj >= 0 && tj < m);
    }
    void DFS(char grid[][], int i, int j) {
        grid[i][j] = '0';
        for(int k = 0; k<4; k++) {
            int ti = i + x[k], tj = j + y[k];
            if(isSafe(ti, tj) && (grid[ti][tj] == 'X')) {
                DFS(grid, ti, tj);
                
            }
        }
    }
    public int xShape(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int count = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(grid[i][j] == 'X') {
                    DFS(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}
