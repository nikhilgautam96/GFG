public class max_circular_subarray_sum {
    static int circularSubarraySum(int a[], int n) {
        // naive
        if(n == 1)
            return a[0];
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            int  sum = a[i], curMaxSum = a[i];
            for(int j = i+1; j%n != i; j++) {
                sum += a[j%n];
                curMaxSum = Math.max(curMaxSum, sum);
            }
            maxSum = Math.max(maxSum, curMaxSum);
        }
        return maxSum;
    }
}
