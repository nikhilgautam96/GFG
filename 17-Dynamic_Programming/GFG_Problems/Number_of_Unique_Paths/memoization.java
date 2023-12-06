// Time : O(a * b), 
// Space : O(a * b) - actually it will take twice the spae bcz of recursion stack.
package Dynamic_Programming.GFG_Problems.Number_of_Unique_Paths;
import java.util.*;
public class memoization {
    static int uniquePaths(int a, int b, int dp[][]) {
        if(a == 1 && b == 1) {
            return 1;
        }
        if(dp[a][b] == -1) {
            if(a == 1) {
                dp[a][b] = uniquePaths(a, b-1, dp);
            } else if(b == 1) {
                dp[a][b] = uniquePaths(a-1, b, dp);
            } else {
                dp[a][b] = uniquePaths(a-1, b, dp) + uniquePaths(a, b-1, dp);
            }
        }
        return dp[a][b];
    }
    public static int NumberOfPath(int a, int b) {
        int dp[][] = new int[a+1][b+1];
        for(int x[] : dp)
            Arrays.fill(x, -1);
        int ans = uniquePaths(a, b, dp);
        return ans;
    }
}
