package Heap;
import java.util.*;
public class rearrange_characters {
    static String rearrangeCharacters(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : str.toCharArray()) {
            if(hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            }else {
                hm.put(ch, 1);
            }
        }
        char ans[] = new char[str.length()];
        int i = 0;
        for(Map.Entry<Character,Integer> e : hm.entrySet()) {
            char ch = e.getKey();
            int f = e.getValue();
            while(f-- > 0) {
                ans[i] = ch;
                i += 2;
                if(i >= ans.length) {i = 1;}
            }
        }
        return String.valueOf(ans);
	}
}
