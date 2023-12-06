package Searching;
public class minimum_number_in_a_sorted_rotated_array {
    static int minNumber(int arr[], int low, int high) {
        // since the array is sorted and rotated so,
        // we will consider the smallest element as the "PIVOT" element.
        while(low <= high) {
            if(low == high)
                return arr[low];
            int mid = low + (high-low)/2;
            if(arr[mid] >= arr[low] && arr[mid] >= arr[high]) {
                low = mid + 1;
            } else {
                // mid can also be a PIVOT here.
                high = mid;
            }
        }
        return -1;
    }
}
