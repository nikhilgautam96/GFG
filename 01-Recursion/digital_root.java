public class digital_root {
    public static int digitalRoot(int n)
    {
        if(n < 10)
            return n;
        int sum = n % 10 + digitalRoot(n / 10);
        return digitalRoot(sum);
    }
}
