package Backtracking.Problems;
import java.util.*;
public class Rat_in_a_maze_with_jumps {
    static boolean isSafe(int arr[][], int i, int j, int n) {
        return (i<n && j<n && arr[i][j] > 0) ;
    }
    static boolean solveMazeRec(int i, int j, int arr[][], int sol[][], int n) {
        if(i == n-1 && j == n-1) {
            // Since our destination is last cell, 
            // so if there is a "0" at arr[n-1][n-1] still we have reached 
            // our destination so we can return true here.
            sol[i][j] = 1;
            // Solution Found, and it will be the with shortest jumps possible
            // as we started making 1 jumps first and then 2 jumps and so on.
            return true;
        }
        if(isSafe(arr, i, j, n)) {
            for(int k = 1; k <= arr[i][j]; k++) {
                sol[i][j] = 1;
                if(solveMazeRec(i, j+k, arr, sol, n) || solveMazeRec(i+k, j, arr, sol, n)) {
                    return true;
                }
                sol[i][j] = 0; // This path does not lead to a solution, so unmark it.
            }
        }
        return false;
    }
    //Function to find the minimum number of Hops required for the rat to 
    //reach from the source block to the destination block.
    public static void solve(int[][] maze, int N) {
        int sol[][] = new int[N][N];
        if(solveMazeRec(0, 0, maze, sol, N) == false) {
            System.out.println("-1");
            return;
        }
        GFG.print(N, sol);
    }
}
//{ Driver Code Starts
class GFG {
    public static int N = 0;
    public static void main(String[] args) {
        // code
        Scanner a = new Scanner(System.in);
        int T = a.nextInt();
        for (int z = 0; z < T; z++) {
            N = a.nextInt();

            int[][] maze = new int[N][N];
            for (int y = 0; y < N; y++) {
                for (int o = 0; o < N; o++) maze[y][o] = a.nextInt();
            }

            new Rat_in_a_maze_with_jumps().solve(maze, N);
        }
    }
    public static void print(int N, int[][] sol) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
}
