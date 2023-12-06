// Time : O(n), Space : O(1);
package Dynamic_Programming.GFG_Problems.Sum_of_all_substring_of_a_number;
public class O_1_Space {
    public static long sumSubstrings(String s) {
        long mod = (long)(1e9 + 7);
        int n = s.length();
        long prev = (long)(s.charAt(0) - '0');
        long ans = prev;
        for(int i = 1; i<n; i++) {
            long ch = (long)(s.charAt(i) - '0');
            long cur = ((ch * (i+1)) + (10 * prev)) % mod;
            ans = (ans + cur) % mod;
            prev = cur;
        }
        return ans % mod;
    }
}
