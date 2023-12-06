// Time : O(n), Space : O(n), O(1)
package Dynamic_Programming.GFG_Problems;
public class Kadane_Algorithm_1 {
    // Space : O(n)
    public long maximumSum_1(int arr[], int sizeOfArray) {
        long dp[] = new long[sizeOfArray];
        dp[0] = arr[0];
        long maxSum = arr[0];
        for(int i = 1; i<sizeOfArray; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }
        for(int i = 0; i<sizeOfArray; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        return maxSum;
    }
    // Space : O(1)
    public long maximumSum_2(int arr[], int sizeOfArray) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int negativeCount = 0, negativeMax = Integer.MIN_VALUE;
        for(int i = 0; i<sizeOfArray; i++) {
            sum += arr[i];
            System.out.print(sum + " ");
            if(sum < 0) {
                negativeCount++;
                negativeMax = Math.max(negativeMax, sum);
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println();
        if(negativeCount == sizeOfArray) return negativeMax;
        return maxSum;
    }
}
