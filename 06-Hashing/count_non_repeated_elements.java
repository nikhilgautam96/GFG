package Hashing;
import java.util.*;
public class count_non_repeated_elements {
    static long countNonRepeated(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i = 0; i<n; i++) {
            if(hm.isEmpty() == true || hm.containsKey(arr[i]) == false) {
                hm.put(arr[i], 1);
            }else {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()) {
            if(e.getValue() == 1)
                count++;
        }
        return count;
    }
}
