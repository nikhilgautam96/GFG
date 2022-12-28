// In this algo we are not doing palindrome chek through a function which takes O(n) time 
// instead we are using an dp[][] array that gives us the result in O(1) time.
// but the overall complexity remains same.

// Time : O(n ^ 3), Space : O(n ^ 2)
package Dynamic_Programming.Palindrome_Partioning;
public class dp_isPalindrome_optimized {
    int count_partition(String S, int n) {
        int dp[][] = new int[n][n];
        boolean isPalindrome[][] = new boolean[n][n];
        for(int i = 0; i<n; i++) {
            dp[i][i] = 0; // every character is palindrome in itself.
            isPalindrome[i][i] = true;
        }
        for(int gap = 1 ; gap < n; gap++) {
            for(int i = 0; i+gap < n; i++) {
                int j = i+gap;
                if((S.charAt(i)==S.charAt(j)) && (isPalindrome[i+1][j-1]==true || gap == 1)) {
                    dp[i][j] = 0;
                    isPalindrome[i][j] = true;
                } else {
                    isPalindrome[i][j] = false;
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
