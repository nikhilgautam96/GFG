// Given an array A[] of N positive integers.
// The task is to find the maximum of j - i subjected to the constraint 
// of A[i] < A[j] and i < j.

public class maximum_index {
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        
        // Your code here
        int rmax[] = new int[N];
        rmax[N-1] = A[N-1];
        for(int i = N-2; i>=0; i--) {
            // rmax[i] = max(A[i] ... A[N-1])
            rmax[i] = Math.max(A[i], rmax[i+1]);
        }
        int ans = -1;
        int i = 0, j = 0;
        while(i<N && j<N) {
            if(rmax[j] >= A[i]) {
                ans = Math.max(ans, j-i);
                j++;
            }else {
                i++;
            }
        }
        return ans;
    }
}
