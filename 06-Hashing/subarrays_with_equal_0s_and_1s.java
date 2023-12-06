package Hashing;
import java.util.HashMap;
public class subarrays_with_equal_0s_and_1s {
    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        for(int i = 0; i<n; i++) {
            if(arr[i] == 0)
                arr[i] = -1;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0, sum = 0;
        hm.put(0, 1); // Since we are starting with '0' sum so freq of '0' sum is '1'.
        for(int i = 0; i<n; i++) {
            sum += arr[i];
            if(hm.containsKey(sum) == true) {
                count += hm.get(sum);
                hm.put(sum, hm.get(sum) + 1);
            }else {
                hm.put(sum, 1);
            }
        }
        return count;
    }
}
