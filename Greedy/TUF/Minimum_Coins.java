// Time : O(V) - where 'V' is the value that we want to find denominations for.
// The below technique fails if,
//          - The Sum of smaller denomination exceeds the next greater denomination.
//          - eg :- d = {1, 5, 6, 9} and V = 11
//          -    here as we can see the greedy technique gives us answer as = {9, 1, 1} = 3 coins.
//          -    but if we use Dynamic Programming we will get = {6, 5} = 2 coins.
//          - This is bcz, [5 + 6] > [9] here so in such situations the greedy technique fails.
package Greedy.TUF;
import java.util.*;
public class Minimum_Coins {
    public static void main(String[] args) {
        int V = 49;
        ArrayList<Integer> ans = new ArrayList<>();
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = coins.length;
        for (int i = n - 1; i >= 0; i--) {
            while (V >= coins[i]) {
                V -= coins[i];
                ans.add(coins[i]);
            }
        }
        System.out.println("The minimum number of coins is " + ans.size());
        System.out.println("The coins are ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" " + ans.get(i));
        }
    
    }
}
