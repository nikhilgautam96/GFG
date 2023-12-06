// Time : Exponential - O(2 ^ n), Space : O(n)
package Dynamic_Programming.GFG_Problems.Nth_Catalan_number;
public class recursive {
    int catalan(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }
}
