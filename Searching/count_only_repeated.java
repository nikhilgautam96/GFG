package Searching;
import java.awt.Point;
public class count_only_repeated {
    public static Point findRepeating(Integer arr[],int n) {
        if(n <= 1)
            return new Point(-1, -1);
        if(arr[n-1] == (arr[0] + n-1)) {
            // This means no element is repeating.
            return new Point(-1, -1);
        }
        int low = 0, high = n-1;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == (arr[0] + mid)) {
                // no repetition in left part of array.
                low = mid + 1;
            }else {
                // this means there is repetition in this part of array.
                high = mid;
            }
        }
        // we have the repeating element as arr[low] or arr[high].
        int freq = n - (arr[n-1] - arr[0]);
        return new Point(arr[low], freq);
    }
}
