import java.util.*;
public class reverse_array_in_groups {
    public static void reverse(ArrayList<Integer> arr, int low, int high) {
        while(low<high) {
            int temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            low++;
            high--;
        }
    }
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i = 0; i < n; i += k){
            int high = Math.min(i+k-1, n-1);
            reverse(arr, i, high);
        }
    }
}
