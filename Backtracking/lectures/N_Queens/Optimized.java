package Backtracking.lectures.N_Queens;
import java.util.*;
public class Optimized {
    static final int N = 4;
    static int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
    boolean isSafe(int row, int col, HashSet<Integer> rows, HashSet<Integer> topD, HashSet<Integer> bottomD) {
        // We an optimize this function by using hashmap/hashset 
        // for storing the row/col/diagonal information.
        // this will reduce the checking time from O(N) to O(1).
        if(rows.contains(row) || topD.contains(row + col) || bottomD.contains((N - 1) + (col - row))) {
            return false;
        }
        return true;
    }
    boolean solveRec(int col, HashSet<Integer> rows, HashSet<Integer> topD, HashSet<Integer> bottomD) {
        if(col == N) {
            return true;
        }
        //we try to fit the "Queen" in every row of this given column, if none fits = return "FALSE".
        for(int i = 0; i<N; i++) {
            if(isSafe(i, col, rows, topD, bottomD)) {
                board[i][col] = 1; // Queen placed here.
                rows.add(i);
                topD.add(i + col);
                bottomD.add((N - 1) + (col - i));
                if(solveRec(col + 1, rows, topD, bottomD)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
    boolean solve() {
        HashSet<Integer> rows = new HashSet<Integer>();
        HashSet<Integer> topD = new HashSet<Integer>();
        HashSet<Integer> bottomD = new HashSet<Integer>();
        if (solveRec(0, rows, topD, bottomD) == false) { 
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
