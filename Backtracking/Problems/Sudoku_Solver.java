// Time : O(9 ^ (n * n))
package Backtracking.Problems;
public class Sudoku_Solver {
    static boolean isSafe(int grid[][], int num, int i, int j, int n) {
        // check for row, column.
        for(int k = 0; k<n; k++) {
            if(grid[i][k] == num || grid[k][j] == num) {
                return false;
            }
        }
        // check for the subgrid.
        int root = (int)Math.sqrt(n);
        int rs = i - (i%root);
        int cs = j - (j%root);
        for(int x = rs; x<rs+root; x++) {
            for(int y = cs; y<cs+root; y++) {
                if(grid[x][y] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean solver(int grid[][], int n) {
        boolean isEmpty = false;
        int i = -1, j = -1;
        for(i = 0; i<n; i++) {
            for(j = 0; j<n; j++) {
                if(grid[i][j] == 0) {
                    isEmpty = true;
                    break;
                }
            }
            if(isEmpty) break;
        }
        if(!isEmpty) {
            // no more cell is empty to fill.
            return true;
        }
        for(int num = 1; num<=9; num++) {
            if(isSafe(grid, num, i , j, n)) {
                grid[i][j] = num;
                if(solver(grid, n)) return true;
                grid[i][j] = 0; // Backtrack.
            }
        }
        return false;
    }
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][]) {
        return solver(grid, grid.length);
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][]) {
        int N = grid.length;
        for (int r = 0; r < N; r++) { 
            for (int d = 0; d < N; d++) { 
                System.out.print(grid[r][d]); 
                System.out.print(" "); 
            }
        } 
    }
}
