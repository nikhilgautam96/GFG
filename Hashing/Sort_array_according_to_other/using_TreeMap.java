package Hashing.Sort_array_according_to_other;
import java.util.*;
public class using_TreeMap {
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i = 0; i<N; i++) {
            if(tm.containsKey(A1[i]) == true) {
                tm.put(A1[i], tm.get(A1[i]) + 1);
            }else {
                tm.put(A1[i], 1);
            }
        }
        int k = 0;
        for(int i = 0; i<M; i++) {
            Integer count = tm.get(A2[i]);
            if(count != null) {
                for(int j = 0; j<count; j++) {
                    A1[k++] = A2[i];
                }
                tm.remove(A2[i]);
            }
        }
        for(Map.Entry<Integer, Integer> e : tm.entrySet()) {
            int num = e.getKey();
            int count = e.getValue();
            for(int j = 0; j<count; j++) {
                A1[k++] = num;
            }
        }
        return A1;
    }
}
