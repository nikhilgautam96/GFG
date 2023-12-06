public class power_of_numbers {
    long mod = (int)(1e9 + 7);
    long power(int N,int R)
    {
        //Your code here
        if(N == 0)
            return 0;
        if(R == 0)
            return 1;
        if(R % 2 == 1) {
            return (N%mod * power(N, R-1)%mod)%mod;
        }
        long res = power(N, R/2);
        return (res%mod * res%mod)%mod;
    }
}
