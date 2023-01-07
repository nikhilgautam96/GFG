// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class Kadane_Algorithm_2 {
    public long maximumSum(int arr[], int sizeOfArray) {
        long dp[] = new long[sizeOfArray];
        dp[0] = arr[0];
        for(int i = 1; i<sizeOfArray; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(arr[i] + ((i>1)?dp[i-2]:(long)0), arr[i]));
        }
        return dp[sizeOfArray-1];
    }
}
