// Time : O(n^2), Space : O(1).
package Sorting;
import java.util.Arrays;
public class triplet_sum {
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        for(int i = n-1; i>=2; i--) {
            int j = 0, k = i-1;
            while(j<k) {
                if(A[j] + A[k] == X-A[i]) {
                    return true;
                }else if(A[j] + A[k] > X-A[i]) {
                    k--;
                }else {
                    j++;
                }
            }
        }
        return false;
    }
}
