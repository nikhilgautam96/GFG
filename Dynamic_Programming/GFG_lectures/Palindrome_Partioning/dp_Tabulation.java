// Time : O(n ^ 3), Space : O(n ^ 2)
package Dynamic_Programming.GFG_lectures.Palindrome_Partioning;
public class dp_Tabulation {
    boolean isPalindrome(String S, int i ,int j) {
        if(i >= j) { return true; }
        if(S.charAt(i) != S.charAt(j)) { return false; }
        return isPalindrome(S, i+1, j-1);
    }
    int count_partition(String S, int n) {
        int dp[][] = new int[n][n];
        for(int i = 0; i<n; i++) {
            dp[i][i] = 0; // every character is palindrome in itself.
        }
        for(int gap = 1 ; gap < n; gap++) {
            for(int i = 0; i+gap < n; i++) {
                int j = i+gap;
                if(isPalindrome(S, i, j)) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for(int k = i; k<j; k++) {
                        dp[i][j] = Math.min(dp[i][j], 1 + dp[i][k] + dp[k+1][j]);
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}
