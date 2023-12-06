public class kadanes_algorithm {
    long maxSubarraySum(int arr[], int n) {
        long maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i< n; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
