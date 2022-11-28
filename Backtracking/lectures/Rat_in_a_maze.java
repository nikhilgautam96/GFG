// Time : O(2 ^ (n * n)) - Since in every cell we have 2 options (1. go down, 2. go right)
//          if the options are (top, down, left, right) then Time = O(4 ^ (n * n)).
// Space : O(n * n)
package Backtracking.lectures;
class Rat_in_a_maze {
    static boolean isSafe(int arr[][], int i, int j, int n) {
        return (i<n && j<n && arr[i][j] == 1) ;
    }
    static boolean solveMazeRec(int i, int j, int arr[][], int sol[][], int n) {
        if(i == n-1 && j == n-1 && arr[i][j] == 1) {
            sol[i][j] = 1;
            return true; // Solution Found.
        }
        if(isSafe(arr, i, j, n)) {
            sol[i][j] = 1;
            if(solveMazeRec(i+1, j, arr, sol, n) || solveMazeRec(i, j+1, arr, sol, n)) {
                return true;
            }
            sol[i][j] = 0; // This path does not lead to a solution, so unmark it.
        }
        return false;
    }
    static void solveMaze(int arr[][], int n) {
        int sol[][] = new int[n][n];
        if(solveMazeRec(0, 0, arr, sol, n) == false) {
            System.out.println("solution does not exists");
            return;
        }
        printSolution(sol, n);
    }
    static void printSolution(int sol[][], int n) { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print( " " + sol[i][j] + " "); 
            System.out.println(); 
        } 
    } 
    public static void main(String args[]) {
        int maze[][] = { { 1, 0, 0, 0 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 0 }, 
                         { 1, 1, 1, 1 } }; 
  
        int n = maze.length; 
        solveMaze(maze, n); 
    }
}
