// Time : O(n ^ 2), Space : O(n).
package Dynamic_Programming.GFG_lectures.Count_BST_with_n_keys;
public class dp_Tabulation {
    static int countBST(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i<=n; i++) {
            dp[i] = 0;
            for(int j = 0; j<i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
    public static void main(String args[]) {
        System.out.println(recursive.countBST(5));
    }
}
