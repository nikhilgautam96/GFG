package String;
import java.util.*;
public class minimum_indexed_character {
    public static int minIndexChar(String str, String patt) {
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i<patt.length(); i++) {
            hs.add(patt.charAt(i));
        }
        for(int i = 0; i<str.length(); i++) {
            if(hs.contains(str.charAt(i)) == true)
                return i;
        }
        return -1;
    }
}
