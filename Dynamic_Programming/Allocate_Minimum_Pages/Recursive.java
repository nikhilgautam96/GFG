// Time : Exponential - O(2 ^ n) {not sure} , Space : O(n).
package Dynamic_Programming.Allocate_Minimum_Pages;
public class Recursive {
    int sum(int arr[], int i, int j) {
        int s = 0;
        for( ; i<=j; i++) { s += arr[i]; }
        return s;
    }
    int minPages(int arr[], int n, int k) {
        if(k == 1) {
            // when student left is one then we assign all pages to that student.
            return sum(arr, 0, n-1);
        }
        if(n == 1) {
            // This condition will not hold true if we are allocating 
            // atleast 1 book to every person bcz, 
            // if(k > 1 && n == 1) means that onle 1 person gets to read that 1 book.
            
            // if number of book remaining is 1, we return that books value.
            return arr[0];
        }
        int res = Integer.MAX_VALUE;
        // below solution is mine,
        //      -> In this way ie starting with (i = k-1) -- we ensure that there is
        //                 atleast "k-1 books" left for "k-1 students"
        //      -> this means every student gets atleast 1 book.
        for(int i = k-1; i<n; i++) {
            res = Math.min(res, Math.max(minPages(arr, i, k-1), sum(arr, i, n-1)));
        }
        // below solution is GFG's,
        //      -> I am not sure how they are ensuring that atleast 1 book gets allocated 
        //          to every student but somehow this technique also seems to evalute the 
        //          correct result for every input set.
        for(int i = 1; i<n; i++) {
            res = Math.min(res, Math.max(minPages(arr, i, k-1), sum(arr, i, n-1)));
        }
        return res;
    }
}
