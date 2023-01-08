// Time : O(n * sum), Space : O(sum).
package Dynamic_Programming.GFG_Problems;
public class Equal_sum_partition {
    public boolean findPartition(int[] a, int n) {
        int sum = 0;
        for(int x : a) {
            sum += x;
        }
        if(sum % 2 == 1) return false;
        sum = sum/2;
        boolean dp[][] = new boolean[2][sum+1];
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=sum; j++) {
                if(i == 0) {
                    // we cant make any sum with '0' elements.
                    dp[i % 2][j] = false;
                } else if(j == 0) {
                    // to make '0 sum' we dont need any element thus it is always true.
                    dp[i % 2][j] = true;
                } else {
                    // we always include the case where we dont need to include cur element.
                    dp[i % 2][j] = dp[(i + 1) % 2][j]; //  => dp[i-1][j].
                    if(a[i-1] <= j) {
                        // we include cur elemet in set only if its value is 
                        // less than the sum needed.
                        // But, we include the current element only if  we can 
                        // get the desired sum by including it or excluding it.
                        dp[i % 2][j] = dp[i % 2][j] || dp[(i + 1) % 2][j - a[i-1]];
                    }
                }
            }
        }
        return dp[n % 2][sum];
    }
}
