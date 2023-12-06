// NP Hard Problem.

// Time : O(2 ^ n), Space : O(n)
package Dynamic_Programming.GFG_lectures._01_Knapsack_Problem;
public class recursive {
    int knapsack(int target, int wt[], int val[], int n) {
        if(target == 0 || n == 0) {
            return 0;
        }
        if(wt[n-1] >= target) {
            return knapsack(target, wt, val, n-1);
        }
        return Math.max(knapsack(target, wt, val, n-1),
                    val[n-1] + knapsack(target - wt[n-1], wt, val, n-1));
    }
}
