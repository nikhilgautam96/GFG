public class swap_all_odd_and_even_bits {
    public static int swapBits(int n) 
    {
	    int even_to_odd_shift = 0xAAAAAAAA; //32-bit hexadecimal no. of type 1010
	    even_to_odd_shift = n & even_to_odd_shift;
	    even_to_odd_shift >>= 1;
	    int odd_to_even_shift = 0x55555555; //32-bit hexadecimal no. of type 0101
	    odd_to_even_shift = n & odd_to_even_shift;
	    odd_to_even_shift <<= 1;
	    return (odd_to_even_shift | even_to_odd_shift);
	}
}
