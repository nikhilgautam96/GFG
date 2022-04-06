// Rearrange an array with O(1) extra space  
// Given an array arr[] of size N where every element is in the range 
// from 0 to n-1. Rearrange the given array so that arr[i] becomes arr[arr[i]].

// Example 1:

// Input:
// N = 5
// arr[] = {4,0,2,1,3}
// Output: 3 4 2 0 1

public class rearrange_array_in_place {
    static void arrange(long arr[], int n) {
        for(int i = 0; i<n; i++) {
            arr[i] += (arr[(int)arr[i]] % n) * n;
        }
        for(int i = 0; i<n; i++) {
            arr[i] /= n;
        }
    }
}
