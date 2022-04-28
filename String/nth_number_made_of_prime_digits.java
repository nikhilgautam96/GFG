// Time : O(log N), Space : O(1).
package String;
public class nth_number_made_of_prime_digits {
    public static int primeDigits(int n) {
        int ans = 0, unit = 1;
        while(n != 0) {
            int r = n % 4;
            if(r == 1) {
                ans = 2 * unit + ans;
            }else if(r == 2) {
                ans = 3 * unit + ans;
            }else if(r == 3) {
                ans = 5 * unit + ans;
            }else {
                ans = 7 * unit + ans;
            }
            unit *= 10;
            if(n % 4 == 0)
                n--;
            n /= 4;
        }
        return ans;
    }
}
