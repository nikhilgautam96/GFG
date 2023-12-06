package Sorting;
import java.util.Arrays;
public class possible_triangles {
    static int findNumberOfTriangles(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for(int i = n-1; i>=2; i--) {
            int upper = i-1, lower = 0;
            while(lower < upper) {
                if(arr[lower] + arr[upper] > arr[i]) {
                    count += upper - lower;
                    upper--;
                }else {
                    lower++;
                }
            }
        }
        return count;
    }
}
