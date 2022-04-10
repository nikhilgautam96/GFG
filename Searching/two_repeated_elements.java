// You are given an array of N+2 integer elements. All elements of the array 
// are in range 1 to N. Also, all elements occur once except two numbers 
// which occur twice. Find the two repeating numbers.

// Note: Return the numbers in their order of appearing twice. 
// So, if X and Y are the repeating numbers, and X repeats twice before Y
// repeating twice, then the order should be (X,Y).
package Searching;
public class two_repeated_elements {
    public int[] twoRepeated(int arr[], int N) {
        
        int ans[] = new int[2];
        int n = N + 2;
        int mod = N+1, k = 0;
        for(int i = 0; i<n; i++) {
            arr[arr[i]%mod] += mod;
            if(arr[arr[i]%mod]/mod == 2) {
                ans[k++] = arr[i]%mod; 
            }
        }
        return ans;
    }
}
