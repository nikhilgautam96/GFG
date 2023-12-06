// Time : Exponential O(2 ^ n) approx, 
// Space : O(n).

// In this recursive solution we do the picking for the opponent and subtract the maximum
//    value picked by the opponent from the total sum of all the elements,
//    ie. - we pick max(i, j-1) & max(i+1, j) for the opponent and in whichever set of values
//          the maximum value picked for the opponent is minimum such that the sum left
//          for us is least minimum we go for that solution.

// The only problem with this approach is that :- since the sum value can be too large,
//          so while converting it to an dp[][] approach we might not be able to
//          create arrays for such large dimensions and also the complexity will be too large.
package Dynamic_Programming.GFG_lectures.Optimal_Strategy_for_a_game;
public class recursive_1 {
    int solution(int arr[], int i, int j, int sum) {
        if(j == i+1) {
            // Here we do the picking for the opponent.
            return Math.max(arr[i], arr[j]);
        }
        return Math.max(sum - solution(arr, i+1, j, sum - arr[i]), 
                        sum - solution(arr, i, j-1, sum - arr[j]));
    }
    int mainSolution(int arr[], int n) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        return solution(arr, 0, n-1, sum);
    }
}
