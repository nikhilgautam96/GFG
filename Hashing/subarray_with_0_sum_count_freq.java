package Hashing;
import java.util.*;
public class subarray_with_0_sum_count_freq {
    public static long findSubarray(long[] arr ,int n) {
        HashMap<Long,Integer> hm = new HashMap<>();
        hm.put(0l, 1);
        int count = 0;
        long sum = 0;
        for(int i = 0; i<n; i++) {
            sum += arr[i];
            if(hm.containsKey(sum) == true) {
                count += hm.get(sum);
                hm.put(sum, hm.get(sum) + 1);
            } else {
                hm.put(sum, 1);
            }
        }
        return count;
    }
}
