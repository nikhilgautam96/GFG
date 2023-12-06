public class largest_power_of_2_in_a_num {
    public static int powerOf_2(int n) {
        int p = 0;
        while((1 << p) <= n) {
            p++;
        }
        // here p will be such that "2^p > n" so we need p-1 as "2^(p-1) <= n"
        return p-1;
    }
}
