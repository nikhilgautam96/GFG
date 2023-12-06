// Time : O(n * m), Space : O(1)
package Graph.GFG_Problems;
public class Length_of_Largest_region_of_1s {
    int x[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1};
    int y[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1};
    int n, m;
    boolean isValid(int ti, int tj) {
        return (ti>=0 && ti<n && tj>=0 && tj<m);
    }
    int DFS(int grid[][], int i, int j) {
        grid[i][j] = 0;
        int area = 1;//if no other cells can be visited then "return 1 for current" cell.
        for(int k = 0; k<8; k++) {
            int ti = i + x[k];
            int tj = j + y[k];
            if(isValid(ti, tj) && grid[ti][tj] == 1) {
                area += DFS(grid, ti, tj);
            }
        }
        return area;
    }
    public int findMaxArea(int[][] grid) {
        int maxArea = 0;
        n = grid.length;
        m = grid[0].length;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, DFS(grid, i, j));
                }
            }
        }
        return maxArea;
    }
}
