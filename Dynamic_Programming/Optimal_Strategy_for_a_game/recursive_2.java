// Time : Exponential O(2 ^ n) approx,
// Space : O(n)

// This approach can be easily converted to a dp[][] based solution.
// since we are always using the number of elements as dimensions (ie. 'n').

// In this approach :- we assume that the opponent plays as efficiently as us and so,
//      we assume that the opponent will always pick the maximum value, 
//      So we give the opponent the set such that even after he picks up the max value
//      we are always left with the maximum sum values (from the minimums left for us).
package Dynamic_Programming.Optimal_Strategy_for_a_game;
public class recursive_2 {
    int solution(int arr[], int i, int j) {
        if(j == i+1) {
            // Here the ooponent does the picking for himself.
            // and he return these maximum values, 
            // so that we pick the minimum of these maximum returned from 2 different sets
            // and add it to our solution.
            // finally we pick the maximum of the sum formed by minimums left for us.
            return Math.max(arr[i], arr[j]);
        }
        return Math.max(arr[i] + Math.min(solution(arr, i+2, j), solution(arr, i+1, j-1)), 
                        arr[j] + Math.min(solution(arr, i+1, j-1), solution(arr, i, j-2)));
    }
    int mainSolution(int arr[], int n) {
        return solution(arr, 0, n-1);
    }
}
