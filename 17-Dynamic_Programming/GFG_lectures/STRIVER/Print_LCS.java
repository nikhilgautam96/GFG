// Time : O(n * m), Space : O(n * m).
package Dynamic_Programming.GFG_lectures.STRIVER;
public class Print_LCS {
    static void lcs(String s1, String s2) {
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
        // Print LCS String :-
        i = n; j = m;
        String ans = "";
        while(i > 0 && j > 0) {
            if(s1.charAt(i-1) == s2.charAt(j-1)) {
                ans = s1.charAt(i-1) + ans;
                i--;
                j--;
            } else if(dp[i-1][j] > dp[i][j-1]){ 
                i--;
            } else {
                j--;
            }
        }
        System.out.println("String is : " + ans + ", Length is : " + dp[n][m]);
    }
    public static void main (String[] args) {
        String s1 = "AXYZ", s2 = "BAZ";
        lcs(s1, s2);
	}
}
