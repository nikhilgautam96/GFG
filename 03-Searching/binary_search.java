package Searching;
public class binary_search {
    static int binarySearchRecursive(int a[], int low, int high, int x) {
        if(low > high)
            return -1;
        int mid = low + (high-low)/2;
        if(a[mid] == x)
            return mid;
        if(x < a[mid]) {
            return binarySearchRecursive(a, low, mid-1, x);
        }
        return binarySearchRecursive(a, mid+1, high, x);
    }
    static int binarySearchIterative(int a[], int n, int x) {
        // In Binary Search if we dont do "mid+1" or "mid-1"
            // Then we can get stuck in an infinite loop.
            // To stop this we will have to do " while(low < high) "
        int low = 0, high = n-1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(a[mid] == x)
                return mid;
            if(x < a[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    static int searchInSorted(int arr[], int N, int K) {
        int r = binarySearchRecursive(arr, 0, N-1, K);
        int i = binarySearchIterative(arr, N, K);
        return (r != -1)? 1 : -1; // return 'K' is found or not.
    }
}
