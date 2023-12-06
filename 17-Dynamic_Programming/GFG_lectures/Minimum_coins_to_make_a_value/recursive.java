// Time : O(n ^ Sum), 
// Space : O(Sum), if at worst case scenarion the sum keeps reducing by 1 value in every 
//          recursive call then at a time we can have a recursion stack of size = sum.
package Dynamic_Programming.GFG_lectures.Minimum_coins_to_make_a_value;
public class recursive {
    int getMin(int coins[], int n, int sum) {
        if(sum == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++) {
            if(coins[i] <= sum) {
                int temp = getMin(coins, n, sum - coins[i]);
                if(temp != Integer.MAX_VALUE) {
                    res = Math.min(res, temp + 1);
                }
            }
        }
        return res;
    }
}
