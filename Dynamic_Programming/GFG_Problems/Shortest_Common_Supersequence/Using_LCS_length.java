// Time : O(n * m), Space : O(n * m).
package Dynamic_Programming.GFG_Problems.Shortest_Common_Supersequence;
public class Using_LCS_length {
    static int lcs(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int dp[][] = new int[n+1][m+1];
        int i, j;
        for(i = 1; i<=n; i++) {
            for(j = 1; j<=m; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static int shortestCommonSupersequence(String X,String Y,int m,int n) {
        int LCS_len = lcs(X, Y);
        int supersequence_len = m + n - LCS_len;
        return supersequence_len;
    }
}
