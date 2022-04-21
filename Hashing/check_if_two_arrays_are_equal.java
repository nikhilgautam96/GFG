package Hashing;
import java.util.*;
public class check_if_two_arrays_are_equal {
    public static boolean check(long A[],long B[],int N) {
        HashMap<Long, Long> hm1 = new HashMap<>();
        HashMap<Long, Long> hm2 = new HashMap<>();
        for(int i = 0; i<N; i++) {
            if(hm1.containsKey(A[i]) == false) {
                hm1.put(A[i], 1l);
            } else {
                hm1.put(A[i], hm1.get(A[i]) + 1);
            }
        }
        for(int i = 0; i<N; i++) {
            if(hm2.containsKey(B[i]) == false) {
                hm2.put(B[i], 1l);
            } else {
                hm2.put(B[i], hm2.get(B[i]) + 1);
            }
        }
        if(hm1.size() == hm2.size()) {
            for(Map.Entry<Long, Long> e : hm1.entrySet()) {
                long key = e.getKey(), val = e.getValue();
                if(hm2.containsKey(key) && hm2.get(key) == val)
                    continue;
                return false;
            }
            return true;
        }
        return false;
    }
}
