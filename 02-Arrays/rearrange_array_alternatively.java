// Given a sorted array of positive integers. Your task is to rearrange
// the array elements alternatively i.e first element should be max value, 
// second should be min value, third should be second max, 
// fourth should be second min and so on.

// Example 1:

// Input:
// N = 6
// arr[] = {1,2,3,4,5,6}
// Output: 6 1 5 2 4 3

public class rearrange_array_alternatively {
    public static void rearrange(long arr[], int n) {
        // since the max element is 'arr[n-1]' 
        // all elements % max+1 will give numbers b/w '1 to max'.
       long mod = arr[n-1] + 1;
       int maxIndex = n-1, minIndex = 0;
       for(int i = 0; i<n; i++) {
           if(i%2 == 0) {
                // store the max element.
                arr[i] += (arr[maxIndex--] % mod) * mod;
           }else {
                //store the min element.
                arr[i] += (arr[minIndex++] % mod) * mod;
           }
       }
       for(int i = 0; i<n; i++) {
           arr[i] /= mod; 
       }
    }
}
