package Searching;
public class peak_element {
    public int peakElement(int[] arr,int n) {
        if(n == 1) return 0;
        int low = 0, high = n-1, peakIndex = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if((mid != 0 && mid != n-1) && 
                     (arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1])) {
                return mid;
            } else if((mid == 0 && arr[mid] >= arr[mid+1])
                         || (mid == n-1 && arr[mid] >= arr[mid-1])){
                return mid;
            } else if(mid != 0 && arr[mid-1] >= arr[mid]) {
                // The Peak element will defenitely be there on left side of
                // It can be on right side as well but,
                // there is 100% surety for left side.
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return peakIndex;
     }
}
