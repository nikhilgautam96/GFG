// We need to find minimum number of multiplications needed to multiply all the given matrices.
// The dimensions of these matrices are given in an array.

// Time : O(n ^ 3), Space : O(n ^ 2).
package Dynamic_Programming.Matrix_Chain_Multiplication;
public class do_Tabulation {
    int count_multiplication(int arr[], int n) {
        // dp[i][j] = Result of subarray from (i to j) in arr[].
        // The answer we looking for is for subarray (0 to n-1) ie = dp[0][n-1].
        int dp[][] = new int[n][n];
        // Now we need to know fro the recursive solution that value of i < j always,
        // so we will have no need for lower half the dp[i][j] matrix where i > j.
        for(int i = 0; i<n-1; i++) {
            dp[i][i+1] = 0;
        }
        for(int gap = 2; gap < n; gap++) {
            for(int i = 0; i+gap<n; i++) {
                int j = i+gap;
                // we calculate value for arr in index (i to j).
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i+1; k<j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + (arr[i]*arr[k]*arr[j]));
                }
            }
        }
        return dp[0][n-1];
    }
}
