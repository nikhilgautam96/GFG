// Given a binary sorted non-increasing array of 1s and 0s. 
// You need to print the count of 1s in the binary array.

// Example 1:

// Input:
// N = 8
// arr[] = {1,1,1,1,1,0,0,0}
// Output: 5
package Searching;
public class count_1s {
    public static int countOnes(int arr[], int N) {

        // In Binary Search if we dont do "mid+1" or "mid-1"
            // Then we can get stuck in an infinite loop.
            // To stop this we will have to do " while(low < high) "
        // In this problem also if we try doing the same, we will get stuck
            // in infinite loop.
        
        int low = 0, high = N-1;
        int rightIndex = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == 1) {
                rightIndex = mid;
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return rightIndex+1;
    }
}
