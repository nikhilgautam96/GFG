package Hashing;
import java.util.HashSet;
public class isogram_string {
    static boolean isIsogram(String data){
        HashSet<Character> hs = new HashSet<>();
        char s[] = data.toCharArray();
        for(char ch : s) {
            if(hs.contains(ch) == true)
                return false;
            hs.add(ch);
        }
        return true;
    }
}
