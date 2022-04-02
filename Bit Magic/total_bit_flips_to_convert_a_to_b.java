public class total_bit_flips_to_convert_a_to_b {
    public static int totalBitFlips(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while(xor > 0) {
            xor = xor & (xor - 1);
            count ++;
        }
        return count;
    }
}
