// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class fibonacci_top_down_dp {
    // long dp[] = new long[100];
    // dp[0] = 0; dp[1] = 1; dp[2] = 1;
    public long findNthFibonacci(int number, long dp[]) {
        if(number>2 && dp[number] == 0) {
            if(number == 0 || number == 1) return number;
            
            dp[number] = findNthFibonacci(number-1, dp) + findNthFibonacci(number-2, dp);
        }
        return dp[number];
    }
}
