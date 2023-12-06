// Time : O(n + r), Space : O(n).
// In this approach we are using the Multiplication operation so many times that 
// it makes this approach much worse for large n values.
package Dynamic_Programming.GFG_Problems.N_C_R;
public class naive {
    public static int nCrModp(int n, int r) {
        if(r > n) return 0;
        if(n == r) return 1;
        if(r == n-1 || r == 1) return n;
        if(r > n/2) {
            r = n-r;
        }
        int mod = (int)(1e9 + 7);
        int x = 1, y = 1;
        // n!/(n-r)! = (n-r+1)!
        for(int i = n; i >= (n-r+1); n--) {
            x = (x % mod * i % mod) % mod;
        }
        // r!
        for(int i = 2; i <= r; i++) {
            y = (y % mod * i % mod) % mod;
        }
        // (n-r+1)!/r!
        return (x/y) % mod;
    }
}
