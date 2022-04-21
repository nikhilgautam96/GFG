package Hashing;
import java.util.*;
public class first_repeating_element_first_index {
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++) {
            if(hm.isEmpty() == true || hm.containsKey(arr[i]) == false) {
                hm.put(arr[i], i+1);
            }else {
                // This means the element is repeating, so we can just compare the index.
                minIndex = Math.min(minIndex, hm.get(arr[i]));
            }
        }
        if(minIndex == Integer.MAX_VALUE)
            return -1;
        return minIndex;
    }
}
