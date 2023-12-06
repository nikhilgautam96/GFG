// Time : Theta(2 ^ n), Space : O(n), recursion stack.
package Dynamic_Programming.GFG_lectures.Subset_sum_problem;
public class recursive {
    int countSubset(int arr[], int n, int sum) {
        if(n == 0) return (sum == 0) ? 1 : 0;
        return countSubset(arr, n-1, sum) + countSubset(arr, n-1, sum - arr[n-1]);
    }
}
