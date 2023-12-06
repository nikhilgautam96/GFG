package Hashing;
import java.util.*;
public class positive_negative_pair {
    public static ArrayList<Integer> findPairs(int arr[], int n) { 
        HashSet<Integer> hs = new HashSet<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            if(hs.contains(-arr[i]) == true) {
                ans.add(-Math.abs(arr[i]));
                ans.add(Math.abs(arr[i]));
            }
            hs.add(arr[i]);
        }
        return ans;
    }
}
