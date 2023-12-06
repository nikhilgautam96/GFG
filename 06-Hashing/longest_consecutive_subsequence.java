package Hashing;
import java.util.HashSet;
public class longest_consecutive_subsequence {
    static int findLongestConseqSubseq(int arr[], int N) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int maxCount = Integer.MIN_VALUE;
        for(int i = 0; i<N; i++) {
            hs.add(arr[i]);
        }
        for(int i = 0; i<N; i++) {
            if(!hs.contains(arr[i] - 1)) {
                //this means this is the begibning element of the subsequence.
                int count = arr[i];
                while(hs.contains(count)) {
                    count++;
                }
                maxCount = Math.max(maxCount, count - arr[i]);
            }
        }
        return maxCount;
     }
}
