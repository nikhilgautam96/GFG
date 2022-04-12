//      Y   0   1   2   3   4
//    X     
//    0     0   0   0   0   0
//    1     1   0   0   0   0
//    2     1   1   0   0   0
//    3     1   1   1   0   1
//    4     1   1   0   0   0

package Sorting;
import java.util.Arrays;
public class number_of_pairs {
    static long countPairs(int x[], int y[], int M, int N) {
        int NoOfY[] = new int[5];
        for(int i = 0; i<N; i++) {
            if(y[i] < 5)
                NoOfY[y[i]]++;
        }
        Arrays.sort(y);
        long count = 0;
        for(int i = 0; i<M; i++) {
            count += findPairs(x[i], y, N, NoOfY);
        }
        return count;
    }
    private static long findPairs(int x, int[] y, int n, int[] NoOfY) {
        // If x is 0, then there cannot be any value in Y
        // such that x^Y[i] > Y[i]^x
        if(x == 0)
            return 0;
        
        // If x is 1, then the number of pairs is equal to
        // number of zeroes in Y[]
        if(x == 1)
            return NoOfY[0];
        long ans = 0;
        
        // Find number of elements in Y[] with values
        // greater than x getting upperbound of x with
        // binary search
        int idx = Arrays.binarySearch(y, x);
        if(idx < 0) {
            idx = Math.abs(idx + 1); 
        }else {
            while(idx < n && y[idx] == x) {
                idx++;
            }
        }
        ans = n - idx;

        // If we have reached here, then x must be greater
        // than 1, increase number of pairs for y=0 and y=1
        ans += (NoOfY[0] + NoOfY[1]);
        if(x == 2) {
            // Decrease number of pairs for x=2 and (y=4 or y=3)
            ans -= (NoOfY[3] + NoOfY[4]);
        }else if(x == 3) {
            // Increase number of pairs for x=3 and y=2
            ans += NoOfY[2];
        }
        return ans;
    }
}
