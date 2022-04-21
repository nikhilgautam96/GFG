package Hashing;
import java.util.HashSet;
public class pair_sum {
    public static int sumExists(int arr[], int N, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(arr[0]);
        for(int i = 1; i<N; i++) {
            if(hs.contains(sum - arr[i]))
                return 1;
            hs.add(arr[i]);
        }
        return 0;
    }
}
