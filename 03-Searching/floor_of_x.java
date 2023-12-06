package Searching;
public class floor_of_x {
    static int findFloor(long arr[], int n, long x) {
        int low = 0, high = n-1, floor = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == x)
                return mid;
            if(x > arr[mid]) {
                floor = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return floor;
    }
}
