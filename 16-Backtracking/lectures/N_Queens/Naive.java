// Time : O(N!), Space O(N ^ 2)
package Backtracking.lectures.N_Queens;
public class Naive {
    static final int N = 4;
    static int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
    boolean isSafe(int row, int col) {
        // 1st check the row.
        for(int i = 0; i < col; i++) {
            if(board[row][i] == 1){
                return false;
            }
        }
        // 2nd check the top left diagonal.
        for(int i = row, j = col; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }
        // 3rd check the bottom left diagonal.
        for(int i = row, j = col; i < N && j >= 0; i++, j--) {
            if(board[i][j] == 1){
                return false;
            }
        }
        // Hence, all paths are clear so return true.
        return true;
    }
    boolean solveRec(int col) {
        if(col == N) {
            return true;
        }
        //we try to fit the "Queen" in every row of this given column, if none fits = return "FALSE".
        for(int i = 0; i<N; i++) {
            if(isSafe(i, col)) {
                board[i][col] = 1; // Queen placed here.
                if(solveRec(col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
    boolean solve() { 
        if (solveRec(0) == false) { 
            System.out.print("Solution does not exist"); 
            return false; 
        }
        printSolution(board); 
        return true; 
    }
    void printSolution(int board[][]) { 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + board[i][j] 
                                 + " "); 
            System.out.println(); 
        } 
    }
}