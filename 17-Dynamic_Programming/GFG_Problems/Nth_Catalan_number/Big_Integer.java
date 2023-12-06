// Time : O(n), Space : O(1).
package Dynamic_Programming.GFG_Problems.Nth_Catalan_number;
import java.math.*;
public class Big_Integer {
    public static BigInteger findCatalan(int n) {
        BigInteger b1 = new BigInteger("1");
        // Nth Catalan num = ((2n)C(n)) * (1/(n+1)) = (2n)!/((n! * n!) * (n+1))
        // calculating (n!)
        for(int i = 1; i<=n; i++) {
            b1 = b1.multiply(BigInteger.valueOf(i));
        }
        // calculating (n! * n!)
        b1 = b1.multiply(b1);
        // calculating (2n)!
        BigInteger b2 = new BigInteger("1");
        for(int i = 1; i<= 2*n; i++) {
            b2 = b2.multiply(BigInteger.valueOf(i));
        }
        // calculating (2n)!/(n! * n!)
        BigInteger ans = b2.divide(b1);
        // (2n)!/((n! * n!) * (n+1))
        ans = ans.divide(BigInteger.valueOf(n + 1));
        return ans;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(findCatalan(n));
    }
}
