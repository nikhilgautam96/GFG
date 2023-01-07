package Dynamic_Programming.GFG_Problems.Shortest_Common_Supersequence;
public class dp_direct_approach {
    static int supersequence(String s1, String s2, int m, int n) {
        int dp[][] = new int[m+1][n+1];
        int i, j;
        for(i = 0; i<=m; i++) {
            for(j = 0; j<=n; j++) {
                if(i == 0) {
                    // if 1st string is empty then 2nd string itself is super-sequence.
                    dp[i][j] = j;
                } else if(j == 0) {
                    // if 2nd string is empty then 1st string itself is super-sequence.
                    dp[i][j] = i;
                } else if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
        // dp[i][j] = 1 {for the unmatched char from either of s1 or s2}
        //                          +
        //            length of shortest subsequence by either removing 
        //            the last char from s1 or from s2. {ie - min(dp[i][j-1], dp[i-1][j])}.
                    dp[i][j] = 1 + Math.min(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
    public static int shortestCommonSupersequence(String X,String Y,int m,int n) {
        return supersequence(X, Y, m, n);
    }
}
