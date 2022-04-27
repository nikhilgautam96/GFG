package String;
import java.util.Arrays;
public class leftmost_non_repeating_char {
    static char nonrepeatingCharacter(String S) {
        int count[] = new int[256];
        Arrays.fill(count, -1);
        for(int i = 0; i<S.length(); i++) {
            if(count[S.charAt(i)] == -1)
                count[S.charAt(i)] = i;
            else
                count[S.charAt(i)] = -2;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<256; i++) {
            if(count[i] != -1 && count[i] != -2)
                min = Math.min(min, count[i]);
        }
        if(min == Integer.MAX_VALUE)
            return '$';
        return S.charAt(min);
    }
}
