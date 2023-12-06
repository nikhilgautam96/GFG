package Hashing;
import java.util.*;
public class winner_of_an_election {
    public static String[] winner(String arr[], int n) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(String s : arr) {
            if(hm.containsKey(s) == true) {
                hm.put(s, hm.get(s) + 1);
            }else {
                hm.put(s, 1);
            }
        }
        String name = "";
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> e : hm.entrySet()) {
            if(e.getValue() > maxValue) {
                name = e.getKey();
                maxValue = e.getValue();
            }else if(e.getValue() == maxValue) {
                name = (name.compareTo(e.getKey()) < 0) ? name : e.getKey();
            }
        }
        String ans[] = new String[2];
        ans[0] = name;
        ans[1] = Integer.toString(maxValue);
        return ans;
    }
}
