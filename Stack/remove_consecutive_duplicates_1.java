package Stack;
import java.util.Stack;
public class remove_consecutive_duplicates_1 {
    public static String removeConsecutiveDuplicates(String str) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        char s[] = str.toCharArray();
        for(char ch : s) {
            if(st.isEmpty() || st.peek() != ch) {
                st.push(ch);
                ans += ch;
            }
        }
        return ans;
    }
}
