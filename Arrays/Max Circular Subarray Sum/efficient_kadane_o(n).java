// The elements that contribute to the maximum sum such that 
// no wrapping is there. 
// Examples: {-10, 2, -1, 5}, {-2, 4, -1, 4, -1}.

//The elements which contribute to the maximum sum such that wrapping is there.
// Examples: {10, -12, 11}, {12, -5, 4, -8, 11}.

public class max_circular_subarray_sum {
    static int kadane(int a[], int n) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i<n; i++) {
            sum += a[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
    static int circularSubarraySum(int a[], int n) {
        int max_kadane = kadane(a,n);
        if(max_kadane < 0)
            return max_kadane;
        // now we calculate the minimum subarray sum 
        // that is affecting the total/maximum sum.
        // and this method is Reverse Kadane.
        // this method is used when inputs that have wrapping come in picture.
        int total = 0;
        for(int i = 0; i<n; i++) {
            total += a[i];
            a[i] = -a[i];
        }
        int reverseKadaneMaxSum = total + kadane(a, n);

        // we also calculated the Kadane Sum before this, bcz for input that
        // does not have any wrapping, the reverse Kadane might give 
        // the wrong answer.

        return Integer.max(max_kadane, reverseKadaneMaxSum);
    }
}
