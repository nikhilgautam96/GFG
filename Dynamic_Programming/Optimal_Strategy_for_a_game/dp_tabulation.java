// Time : O(n ^ 2), Space : O(n ^ 2).

// When thigs happen to you --> "Assume the worst"
// When you do the things --> "do the best"
// Thats why while selecting we do best --> 
//          Max(arr[i] + let opponent do selction(i+1, j), 
//                  arr[j] + let opponent do selection(i, j-1))
// let opponent do selction --> here things will happen to us, so we assume the worst.
//          Thus --> Min((arr, i+2, j), (arr, i+1, j-1))

// Here, 
// if (we select { arr[i] })--> whats left for opponent is {i+1 to j}
//          now if(opponent selects {arr[i+1]}) --> left for us is {i+2, j}
//              if(opponent selects {arr[j]}) --> left for us is {i+1, j-1}
// when opponent does the selection, he will select the max(arr[i+1], arr[j])
//      thus, we are left with --> min(solution(arr, {i+2, j}), solution(arr, {i+1, j-1}))
// ie. --> he will do the selection in such a way that we are left with the minimum value.
//      thats why we just get the minimum((i+2, j), (i+1, j-1)) by force.
package Dynamic_Programming.Optimal_Strategy_for_a_game;
public class dp_tabulation {
    int solution(int arr[], int n) {
        // dp[i][j] = maximum sum answer possible from the set(i, j) from arr.
        // ie. if( i = 1, j = 3) => maxAnswerPossibleFrom(arr[1], arr[2], arr[3]).
        // therefore, the answer is maximum sum answer from set(0, n-1)
        // ie. "dp[0][n-1]" is our answer.
        int dp[][] = new int[n][n];
        for(int gap = 0; gap < n; gap++) {
            for(int i = 0, j = gap; j<n; i++, j++) {
                if(gap == 0) {
                    // if there is 1 value left and we are the 1st one to pick,
                    // then we will have that value as our answer.
                    dp[i][j] = arr[i];
                }else if(gap == 1) {
                    // for 2 values we know the maximum answer possible is by ouselves 
                    // picking up the maximum value and giving the opponent the minimum value 
                    // to pick.
                    // even though he is playing as efficiently as us, but since we get to
                    // pick up first we will always give the opponent the minimum set to 
                    // pick from and same does the opponent for us.
                    dp[i][j] = Math.max(arr[i], arr[j]);
                } else {
                    dp[i][j] = Math.max(arr[i] + Math.min(dp[i+2][j], dp[i+1][j-1]), 
                                        arr[j] + Math.min(dp[i+1][j-1], dp[i][j-2]));
                }
            }
        }
        return dp[0][n-1];
    }
}
