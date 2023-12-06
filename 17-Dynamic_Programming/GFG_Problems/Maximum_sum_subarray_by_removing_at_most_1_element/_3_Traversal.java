// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems.Maximum_sum_subarray_by_removing_at_most_1_element;
public class _3_Traversal {
    public static int maxSumSubarray(int A[], int n) {
        int fs[] = new int[n];
        int bs[] = new int[n];
        int maxSum = Integer.MIN_VALUE, sum = 0;
        // maxSum = sum = fs[0] = A[0];
        for(int i = 0; i<n; i++) {
            sum += A[i];
            fs[i] = sum;
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        sum = 0;
        for(int i = n-1; i>=0; i--) {
            sum += A[i];
            bs[i] = sum;
            if(sum < 0) {
                sum = 0;
            }
        }
        int ans = maxSum;
        for(int i = 1; i<n-1; i++) {
            ans = Math.max(ans, fs[i-1] + bs[i+1]);
        }
        return ans;
    }
}
