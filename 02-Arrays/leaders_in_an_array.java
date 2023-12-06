import java.util.*;
public class leaders_in_an_array {
    static ArrayList<Integer> leaders(int arr[], int n) {
        int rmax = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = n-1; i>=0; i--) {
            if(arr[i] >= rmax) {
                rmax = arr[i];
                ans.add(rmax);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
