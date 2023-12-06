package Hashing.Sort_array_according_to_other;
import java.util.*;
public class using_HashMap {
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        Arrays.sort(A1);
        int k = 0;
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for(int i = 0; i<N; i++) {
            if(hm.containsKey(A1[i])) {
                hm.put(A1[i], hm.get(A1[i])+1);
            }else {
                hm.put(A1[i], 1);
            }
        }
        for(int i = 0; i<M; i++) {
            if(hm.containsKey(A2[i])) {
                int count = hm.get(A2[i]);
                if(count > 0) {
                    for(int j = 0; j<count; j++) {
                        A1[k++] = A2[i];
                    }
                    hm.remove(A2[i]);
                }
            }
        }
        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int num = e.getKey();
            int count = e.getValue();
            for(int j = 0; j<count; j++) {
                A1[k++] = num;
            }
        }
        return A1;
    }
}
