package Searching.more_questions;
public class leftmost_rightmost_index_of_x {
    public static int calcRec(int a[], int low, int high) {
        if(low > high)
            return -1;
        if(low == high)
            return low;
        int mid = low + (high-low)/2;
        if(a[mid] == 1) {
            // search in the left part of array.
            return calcRec(a, low, mid);
        }
        return calcRec(a, mid+1, high);
    }
    public static int calcItr(int a[], int n) {
        int low = 0, high = n-1;
        while(low <= high) {
            if(low == high)
                return low;
            int mid = low + (high - low)/2;
            if(a[mid] == 1) {
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static int rightMostIndex(int a[], int n) {
        int low = 0, high = n-1, rightIndex = -1;
        while(low <= high) {
            if(low == high)
                return low;
            int mid = low + (high - low)/2;
            if(a[mid] == 1) {
                rightIndex = mid;
                low = mid+1; // we search in the right part of original array.
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static int leftMostIndex(int a[], int n) {
        // int rec = calcRec(a, 0, n-1);
        int itr = calcItr(a, n);
        // if(rec == itr)
            return itr;
        // return -1;
    }
    public static int countOnes(int arr[], int N) {
        // To get count of 1's = rightMostIndex(1) - leftMostIndex(1).
        int right = rightMostIndex(arr, N);
        int left = leftMostIndex(arr, N);
        return right - left + 1;
    }
}
