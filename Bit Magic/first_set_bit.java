public class find_first_set_bit {
    public static int getFirstSetBit(int n){            
        if(n == 0) return 0;
        int setBit = n - (n & (n-1)); // n ^ (n & (n-1))
        int pos = (int)(Math.log10(setBit)/Math.log10(2)); // log2(setBit)
        return pos + 1;
    }
}
