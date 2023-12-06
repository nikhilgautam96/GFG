import java.util.*;
public class power_set_using_recursion {
    static void getString(String s, String cur, int i, ArrayList<String> ans) {
        if(i == s.length()) {
            ans.add(cur);
            return;
        }
        getString(s, cur + s.charAt(i), i+1, ans);
        getString(s, cur, i+1, ans);
    }
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> ans = new ArrayList<String>();
        getString(s, "", 0, ans);
        return ans;
    }
}
