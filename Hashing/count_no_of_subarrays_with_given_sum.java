package Hashing;
import java.util.HashMap;
public class count_no_of_subarrays_with_given_sum {
    static int subArraySum(int arr[], int n, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int s = 0, count = 0;
        for(int i = 0; i<n; i++) {
            s += arr[i];
            if(s == sum)
                count++;
            if(hm.containsKey(s - sum) == true)
                count += hm.get(s - sum);
            if(hm.containsKey(s) == true) {
                hm.put(s, hm.get(s) + 1);
            }else {
                hm.put(s, 1);
            }
        }
        return count;
    }
}
