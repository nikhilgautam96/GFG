package Sorting;
public class closer_to_sort {
    static long closer(int arr[], int n, long x) {
        int low = 0, high = n-1;
        int X = (int)x;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == X) {
                return (long)mid;
            }else if(mid != 0 && arr[mid-1] == X) {
                return (long)(mid-1);
            }else if(mid != n-1 && arr[mid+1] == X) {
                return (long)(mid+1);
            }
            if(X < arr[mid]) {
                high = mid - 2;
            }else {
                low = mid + 2;
            }
        }
        return -1l;
    }
}
