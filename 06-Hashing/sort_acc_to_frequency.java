package Hashing;
import java.util.*;
public class sort_acc_to_frequency {
    static ArrayList<Integer> sortByFreq(int arr[], int n) {
        ArrayList<Integer> ans  = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<n; i++) {
            if(hm.containsKey(arr[i]) == true) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }else {
                hm.put(arr[i], 1);
            }
            ans.add(arr[i]);
        }
        
        Collections.sort(ans, new Comparator<Integer> () {
            public int compare(Integer x, Integer y) {
                if(hm.get(x) == hm.get(y)) {
                    return x - y;
                }
                return hm.get(y) - hm.get(x);
            }
        });
        return ans;
    }
}
