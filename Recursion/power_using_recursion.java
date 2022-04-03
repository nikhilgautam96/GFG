public class power_using_recursion {
    static int RecursivePower(int n, int p) {
    // method 1
        if(p == 0)
            return 1;
        return n * RecursivePower(n, p-1);
        
    // method 2 - below method is fast exponentiation using recursion in "O(Log P)"
        // {
        //     if(n == 0)
        //         return 0;
        //     if(p == 0)
        //         return 1;
        //     if(p % 2 == 1) {
        //         return n * RecursivePower(n, p-1);
        //     }
        //     int res = RecursivePower(n, p/2);
        //     return res * res;
        // }
    }
}
