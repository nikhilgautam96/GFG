package Backtracking.Problems;
public class Black_and_white {
    static boolean exists(int i, int j, int N, int M) {
        if(i >= 0 && i < N && j >= 0 && j < M) 
            return true;
        return false;
    }
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    static long numOfWays(int N, int M) {
        // add your code here
        long unsafe = 0, MOD = 1000000007;
        int x[] = new int[] {-2, -2, 2, 2, 1, 1, -1, -1};
        int y[] = new int[] {1, -1, 1, -1, -2, 2, -2, 2};
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<M; j++) {
                for(int k = 0; k<8; k++) {
                    if(exists(i + x[k], j + y[k], N, M)) {
                        // if the given coordinate exists then placing knights at,
                        // (i, j) & (i + x[k], j + y[k]) will create a conflict.
                        unsafe++;
                    }
                }
            }
        }
        long total = M * N;
        total = (total * (total-1)) % MOD;
        return (total + MOD - unsafe) % MOD;
    }
}
