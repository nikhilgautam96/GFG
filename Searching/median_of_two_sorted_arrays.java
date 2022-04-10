// There is one more method to solve this problem - we can merge the two arrays
// in O(n) time and while merging check if we have reached the middle of 
// the merged array then just return the answer, it will take O(1) space 
// if done without using extra array to store the merged result and 
// instead just keep incrementing the pointers.


// Time : O(log(min(n, m))) Sspace : O(1)
package Searching;
public class median_of_two_sorted_arrays {
    public static int findMedian(int arr[], int n, int brr[], int m) {
        if(n > m)
            return findMedian(brr, m, arr, n);
        int low = 0, high = n, partitionX = 0, partitionY = 0;
        while(low <= high) {
            partitionX = low + (high-low)/2;
            partitionY = (n + m + 1)/2 - partitionX;
            int max_a = (partitionX == 0) ? Integer.MIN_VALUE : arr[partitionX-1];
            int min_a = (partitionX == n) ? Integer.MAX_VALUE : arr[partitionX];
            int max_b = (partitionY == 0) ? Integer.MIN_VALUE : brr[partitionY-1];
            int min_b = (partitionY == m) ? Integer.MAX_VALUE : brr[partitionY];
            if(max_a <= min_b && max_b <= min_a) {
                // we have found a partition.
                int median = 0;
                if((n+m)%2 == 0) {
                    median = (Math.max(max_a, max_b) + Math.min(min_b, min_a))/2;
                }else {
                    // the left part of array will always have more elements 
                    // in case of odd total number of elements.
                    median = Math.max(max_a, max_b);
                }
                return median;
            }else if(max_a > min_b) {
                high = partitionX - 1;
            }else {
                // max_b > min_a.
                low = partitionX + 1;
            }
        }
        return -1;
    }
}
