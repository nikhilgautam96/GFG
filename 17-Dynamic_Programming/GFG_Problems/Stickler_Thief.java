// This Problem is "Maximum Sum of Non Consecutive Elements".
// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class Stickler_Thief {
    public int FindMaxSum_1(int arr[], int n) {
        if(n == 1) return arr[0];
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for(int i = 2; i<n; i++) {
            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
}
