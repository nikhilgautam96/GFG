// Time : O(k * n ^ 3), we can optimize the solution by precomputing the Sum of pages
//          thus our compexity will become --> O(k * n^2)
// Space : Theta(n * k), if we precompute sums then Space : O(n * n)
package Dynamic_Programming.GFG_lectures.Allocate_Minimum_Pages;
public class dp_Tabulation {
    static int sum(int arr[], int i, int j) {
        int s = 0;
        for( ; i<=j; i++) { s += arr[i]; }
        return s;
    }
    static int minPages(int arr[], int n, int k) {
        int dp[][] = new int[k+1][n+1];
        // dp[i][j] = minimum Pages for 'i' students and 'j' books.
                    // or
        // dp[i][j] = min(max(pages allocated to a student)) where 'j' books are distributed
        //              among 'i' students and every student gets maximum number of pages 
        //              possible, such that the student who got the maximum page 
        //              has as minimum Page as possible.

        for(int i = 1; i<=n; i++) {
            // if student = 1 then maximum pages = sum(all pages available)
            // dp[1][i] = all i books allocated to that student only.
            dp[1][i] = sum(arr, 0, i-1);
        }
        for(int i = 1; i<=k; i++) {
            // below step is invalid if we have to allocate atleast 1 book to every student.
            // bcz, if(book == 1 && student > 1) then there is no way 
            //                  every student gets atleast 1 book, so
            // dp[i][1] should be = "Integer.MAX_VALUE"
            dp[i][1] = arr[0];
        }
        // GFG Solution.
        for(int i = 2; i<=k; i++) {
            for(int j = 2; j<=n; j++) {
                int res = Integer.MAX_VALUE;
                for(int x = 1; x<j; x++) {
                    res = Math.min(res, Math.max(dp[i-1][x], sum(arr, x, j-1)));
                }
                dp[i][j] = res;
            }
        }
        // below solution is mine,
        //      -> In this way i.e. starting with (x = i-1) -- we ensure that there is
        //                 atleast "i-1 books" left for "i-1 students"
        //      -> this means every student gets atleast 1 book.
        for(int i = 2; i<=k; i++) {
            for(int j = 2; j<=n; j++) {
                int res = Integer.MAX_VALUE;
                for(int x = i-1; x<j; x++) {
                    // by starting with x = i-1, we ensure that 'i-1' student will get 
                    // atleat 1 book each when we look for dp[i-1][x].
                    res = Math.min(res, Math.max(dp[i-1][x], sum(arr, x, j-1)));
                }
                dp[i][j] = res;
            }
        }
        return dp[k][n];
    }
    public static void main(String[] args) {
        int arr[] = {19, 81, 2, 41, 61, 59, 28, 69, 76, 88};
        System.out.println(minPages(arr, 10, 5));
    }
}
