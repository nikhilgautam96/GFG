// Time : O(n * m), Space : o(n * m).
package Dynamic_Programming.STRIVER;
public class Print_Superseuence {
    static void supersequence(String s1, String s2, int m, int n) {
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
                    dp[i][j] = 1 + Math.min(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        // Print Supersequence
        i = m; j = n;
        String ans = "";
        while(i>0 && j>0) {
            if(s1.charAt(i-1) == s2.charAt(j-1)) {
                ans = s1.charAt(i-1) + ans;
                i--;
                j--;
            } else if(dp[i-1][j] < dp[i][j-1]){
                ans = s1.charAt(i-1) + ans;
                i--;
            } else {
                ans = s2.charAt(j-1) + ans;
                j--;
            }
        }
        while(i>0) {
            ans = s1.charAt(i-1) + ans;
            i--;
        }
        while(j>0) {
            ans = s2.charAt(j-1) + ans;
            j--;
        }
        System.out.println("String is : " + ans + ", Length is : " + dp[m][n]);
    }
    public static void shortestCommonSupersequence(String X,String Y,int m,int n) {
        supersequence(X, Y, m, n);
    }
}
