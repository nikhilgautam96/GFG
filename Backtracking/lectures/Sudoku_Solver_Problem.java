public class Sudoku_Solver_Problem {
    static boolean isSafe(int i, int j, int num, int N, int b[][]) {
        // 1st check for i'th row and j'th column.
        for(int k = 0; k<N; k++) {
            if((b[i][k] == num) || (b[k][j] == num)) {
                return false;
            }
        }
        // check for the grid that the cell b[i][j] belongs to.
        int squareRoot = (int)Math.sqrt(N);
        int rs = i - (i % squareRoot);
        int cs = j - (j % squareRoot);
        for(int x = rs; x < rs + squareRoot; x++) {
            for(int y = cs; y < cs + squareRoot; y++) {
                if(b[x][y] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean solveSudoku(int b[][], int N) {
        int i = -1, j = -1;
        boolean isEmpty = false;
        for(i = 0; i<N; i++) {
            for(j = 0; j<N; j++) {
                if(b[i][j] == 0) {
                    isEmpty = true;
                    break;
                }
            }
            if(isEmpty) break;
        }
        if(!isEmpty) {
            // this means there are no empty cells left.
            return true;
        }
        for(int num = 1; num<=N; num++) {
            if(isSafe(i, j, num, N, b)) {
                b[i][j] = num;
                if(solveSudoku(b, N)) {
                    return true;
                }
                // else - backtrack and replace the num value.
                b[i][j] = 0;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int[][] board = new int[][] { 
            { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
            { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, 
            { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
            { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
            { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, 
            { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
            { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
            { 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
        }; 
        int N = board.length; 
        if(solveSudoku(board, N)) {  
            print(board, N); 
        }else { 
            System.out.println("No solution"); 
        } 
    }
    public static void print(int[][] board, int N) { 
        for (int r = 0; r < N; r++) { 
            for (int d = 0; d < N; d++) { 
                System.out.print(board[r][d]); 
                System.out.print(" "); 
            }
            System.out.print("\n"); 
            if ((r + 1) % (int)Math.sqrt(N) == 0) { 
                System.out.print(""); 
            }
        } 
    } 
}
