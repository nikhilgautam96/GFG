// Time: O(N) where 'N' is the number of digits.
// Space : O(1)
package Greedy.Problems;
public class Largest_Num_with_given_Sum {
    static String largestNumber(int n, int sum) {
        if(sum > 9 * n)
            return "-1";
        String ans = "";
        while(n > 0) {
            if(sum > 9) {
                ans += (char)('9');;
                sum -= 9;
            } else {
                ans += (char)(sum + '0');;
                sum = 0;
            }
            n--;
        }
        return ans;
    }
}
