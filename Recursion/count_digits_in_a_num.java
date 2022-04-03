public class count_digits_in_a_num {
    public static int countDigits(int n)
    {
        // one way is to find "Floor(Log(n) + 1)" int O(1) time.
        if(n < 10)
            return 1;
        return 1 + countDigits(n/10);
    }
}
