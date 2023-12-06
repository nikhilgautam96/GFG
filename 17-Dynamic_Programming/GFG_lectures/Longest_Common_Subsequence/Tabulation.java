// Time : Theta(n * m), Space : Theta(n * m).
package Dynamic_Programming.GFG_lectures.Longest_Common_Subsequence;
public class Tabulation {
    static int lcs(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int dp[][] = new int[n+1][m+1];
        
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=m; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main (String[] args) {
        String s1 = "AXYZ", s2 = "BAZ";
        System.out.println(lcs(s1, s2));
	}
}
