public class josephus_problem {
    public int josephus(int n, int k) {
        if(n == 1) {
            return n;
        }
        return (josephus(n-1, k) + k-1)%n + 1;
    }
}