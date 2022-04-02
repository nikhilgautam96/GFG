public class number_is_sparse_or_not {
    public static boolean isSparse(int n) {
        // Your code here
        if((n & (n >> 1)) > 0 ) {
            return false;
        }
        return true;
    }
}
