public class check_if_kth_bit_is_set {
    static boolean checkKthBit(int n, int k)
    {
        k = k + 1; // converting 0 based indexing to 1 based.
        if((n & (1 << (k-1))) > 0) {
            return true;
        }
        return false;
    }
}
