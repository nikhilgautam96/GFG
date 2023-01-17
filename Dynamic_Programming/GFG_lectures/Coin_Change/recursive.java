// Time : O(2 ^ n) - since we either select/ignore the coin.
// Space : O(n + sum) - since the recursion tree will either reduce the coins
//                      or reduce the sum or do both alternatively in which case,
//                      we have tree size as "n + sum".
package Dynamic_Programming.GFG_lectures.Coin_Change;
public class recursive {
    int count_Ways(int coins[], int n, int sum) {
        if(sum == 0) {
            return 1; // we return '1' for one possible solution found.
        }
        if(n == 0 || sum < 0) {
            return 0; // No solution possible.
        }
        // Else ->  { 1. we either select the coin - in this case number of coins still 
        //                                          remains the same but the sum is 
        //                                          reduced by the n'th coins value.
        //            2. we don't select the coin - in this case we are left with 'n-1' coins
        //                                          and the sum also remains the same. }
        return count_Ways(coins, n, sum - coins[n-1]) + count_Ways(coins, n-1, sum);
    }
}
