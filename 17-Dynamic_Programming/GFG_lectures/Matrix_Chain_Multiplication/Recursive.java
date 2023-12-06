// Time : O(2 ^ n), Space : O(n).
// We need to find minimum numbr of multiplications needed to multiply all the given matrices.
// The dimensions of these matrices are given in an array.
package Dynamic_Programming.GFG_lectures.Matrix_Chain_Multiplication;
public class Recursive {
    int count_multiplication(int arr[], int i, int  j) {
        if(i + 1 == j) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int k = i+1; k<j; k++) {
            res = Math.min(res, count_multiplication(arr, i, k) + 
                                count_multiplication(arr, k, j) + arr[i]*arr[k]*arr[j]);
        }
        return res;
    }
}
