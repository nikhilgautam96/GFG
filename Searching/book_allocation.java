package Searching;
public class book_allocation {
    public static boolean isPossible(int a[], int n, int m, int mid) {
        int pageSum = 0, studentCount = 1;
        for(int i = 0; i<n; i++) {
            if(pageSum + a[i] <= mid) {
                pageSum += a[i];
            }else {
                studentCount++;
                if(studentCount > m || a[i] > mid) {
                    return false;
                }
                pageSum = a[i];
            }
        }
        return true;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A, int N, int M) {
        int sum = 0;
        for(int i = 0; i<N; i++) {
            sum += A[i];
        }
        int low = 0, high = sum;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(isPossible(A, N, M, mid) == true) {
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
