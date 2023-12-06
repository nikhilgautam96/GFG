package Searching;
public class left_index {
    static int leftIndex(int N, int arr[], int X) {
        int low = 0, high = N-1, leftIndex = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == X) {
                leftIndex = mid;
                high = mid - 1;
            }else if(X < arr[mid]) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return leftIndex;
     }
}
