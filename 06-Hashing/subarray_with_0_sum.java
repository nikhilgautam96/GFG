package Hashing;
import java.util.HashSet;
public class subarray_with_0_sum {
    static boolean findsum(int arr[],int n) {
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        for(int i = 0; i<n; i++) {
            sum += arr[i];
            if(sum == 0 || arr[i] == 0 || hs.contains(sum) == true)
                return true;
            hs.add(sum);
        }
        return false;
    }
}
