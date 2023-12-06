package String;
import java.util.HashSet;
public class remove_common_chars_in_two_strings {
    public static String concatenatedString(String s1, String s2) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        for(int i = 0; i<s1.length(); i++) {
            hs1.add(s1.charAt(i));
        }
        for(int i = 0; i<s2.length(); i++) {
            hs2.add(s2.charAt(i));
        }
        String ans = "";
        for(int i = 0; i<s1.length(); i++) {
            if(hs2.contains(s1.charAt(i)) == false)
                ans += s1.charAt(i);
        }
        for(int i = 0; i<s2.length(); i++) {
            if(hs1.contains(s2.charAt(i)) == false)
                ans += s2.charAt(i);
        }
        if(ans == "")
            return "-1";
        return ans;
    }
}
