// Time : O(n * n), Space : O(n * n)
package Graph.GFG_Problems;
public class Find_whether_path_exists {
    int x[] = new int[] {1, -1, 0, 0};
    int y[] = new int[] {0, 0, 1, -1};
    public boolean isValid(int i, int j, int n) {
        return ((i>=0 && i<n) && (j>=0 && j<n));
    }
    public boolean dfs(int m[][], int i, int j, int n) {
        if(m[i][j] == 2) {
            // destination reached.
            return true;
        }else if(m[i][j] == 0) {
            return false;
        }
        m[i][j] = -1;
        for(int k = 0; k<4; k++) {
            int ti = i+x[k], tj = j+y[k];
            if(isValid(ti, tj, n) && m[ti][tj] != -1) {
                if(dfs(m, ti, tj, n)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean is_Possible(int[][] grid) {
        int n = grid.length;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(grid[i][j] == 1) {
                    return dfs(grid, i, j, n);
                }
            }
        }
        return false;
    }
}
