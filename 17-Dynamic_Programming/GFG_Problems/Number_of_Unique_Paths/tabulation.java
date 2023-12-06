// Time : O(a * b), 
// Space : (a * b) - no extra space for recursion stack.
package Dynamic_Programming.GFG_Problems.Number_of_Unique_Paths;
public class tabulation {
    public static int NumberOfPath(int a, int b) {
        int dp[][] = new int[a][b];
        for(int i = 0; i<a; i++) {
            for(int j = 0; j<b; j++) {
                if(i == 0) {
                    // count of paths to reach any cell in first row is always 1.
                    dp[i][j] = 1;
                } else if(j == 0) {
                    // count of paths to reach any cell in first column is always 1.
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[a-1][b-1];
    }
}
