// Complexity = O(log N)

public class total_set_bits_for_all_num_from_1_to_N {
    public static int countSetBits(int N) {
        int ans = 0;
        while(N != 0) {
            int largestPowerOf2 = powerOf_2(N);
            int bitsTillLargestPowerOf2 = largestPowerOf2 * (1 << (largestPowerOf2 - 1));
            int bitsInMsbTillN = N - (1 << largestPowerOf2) + 1;
            int remaining = N - (1 << largestPowerOf2);
            ans += bitsTillLargestPowerOf2 + bitsInMsbTillN; //recusive call(remaining).
            N = remaining;
        }
        return ans;
    }
    public static int powerOf_2(int n) {
        int p = 0;
        while((1 << p) <= n) {
            p++;
        }
        // here p will be such that "2^p > n" so we need p-1 as "2^(p-1) <= n"
        return p-1;
    }
}
