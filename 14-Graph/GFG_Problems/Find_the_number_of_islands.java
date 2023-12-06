// Time : O(n * m) as DFS is used.
// Space : O(n * m) for recursion stack.
package Graph.GFG_Problems;
public class Find_the_number_of_islands {
    int n, m;
    int x[] = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
    int y[] = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
    boolean isSafe(int ti, int tj) {
        if(ti >= 0 && ti < n && tj >= 0 && tj < m) {
            return true;
        }
        return false;
    }
    void DFS(char grid[][], int i, int j) {
        grid[i][j] = '0';
        for(int k = 0; k<8; k++) {
            int ti = i + x[k], tj = j + y[k];
            if(isSafe(ti, tj) && (grid[ti][tj] == '1')) {
                DFS(grid, ti, tj);
                
            }
        }
    }
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int count = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(grid[i][j] == '1') {
                    DFS(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}
