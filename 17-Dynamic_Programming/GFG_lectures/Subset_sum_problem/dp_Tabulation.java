// Time : O(n * Sum), Space : O(Sum), since this is space optimized approach.
package Dynamic_Programming.GFG_lectures.Subset_sum_problem;
import java.util.*;
public class dp_Tabulation {
    int countSubset(int arr[], int n, int sum) {
        // if the array elements include '0' then we should first sort the array 
        // or we will get wrong answer in below approach.
        Arrays.sort(arr);
        // we are using space optimized dp.
        int dp[][] = new int[2][sum+1]; 
        //For sum = '0' with zero/any num of elements we have "empty set" as possible subset.
        dp[0][0] = 1;
        dp[1][0] = 1;
        for(int i = 1; i<=sum; i++) {
            dp[0][i] = 0;
        }
        int x = 0, y = 0;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=sum; j++) {
                x = (i % 2);
                y = (i % 2 == 1) ? 0 : 1;
                if(arr[i-1] <= j) {
                    // we include the "i th" element only if its value is less than Sum.
                    dp[x][j] = dp[y][j - arr[i-1]];
                }
                dp[x][j] += dp[y][j];
            }
        }
        return dp[x][sum];
    }
}
