// Time : Theta(n * m), Space : Theta(n * m)
package Dynamic_Programming.Edit_Distance_Problem;
public class Tabulation {
    int edit_distance(String s1, String s2, int n, int m) {
        int dp[][] = new int[n+1][m+1];
        // dp[i][j] = Edit distance for s1[0 to i-1] and s2[0 to j-1]
        for(int i = 0; i<=n; i++) {
            dp[i][0] = i;
        }
        for(int j = 0; j<=m; j++) {
            dp[0][j] = j;
        }
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=m; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
        // dp[i][j] = min(delete i from s1, append j to s1, replace i in s1 with j in s2)
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
}
