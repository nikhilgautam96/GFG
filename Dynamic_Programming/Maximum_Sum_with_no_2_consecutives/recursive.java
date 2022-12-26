// Time : O(2 ^ n), but the actual bound is = "golden-ratio ^ n"
package Dynamic_Programming.Maximum_Sum_with_no_2_consecutives;
public class recursive {
    int maxSum(int arr[], int n) {
        if(n == 1) return arr[0];
        if(n == 2) return Math.max(arr[0], arr[1]);

        return Math.max(maxSum(arr, n-1), arr[n-1] + maxSum(arr, n-2));
    }
}
