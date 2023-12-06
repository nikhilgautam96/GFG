import java.util.*;
public class max_and_2nd_max {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        int max = -1, smax = -1;
        int n = sizeOfArray;
        for(int i = 0; i<n; i++) {
            if(arr[i] > max) {
                smax = max;
                max = arr[i];
            }else if(arr[i] != max && arr[i] > smax) {
                smax = arr[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(max);
        ans.add(smax);
        return ans;
    }
}
