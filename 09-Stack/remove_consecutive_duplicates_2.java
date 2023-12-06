package Stack;
import java.util.Stack;
public class remove_consecutive_duplicates_2 {
    public static String removePair(String str) {
        Stack<Character> st = new Stack<>();
        char s[] = str.toCharArray();
        String ans = "";
        for(char ch : s) {
            if(st.isEmpty() || st.peek() != ch) {
                st.push(ch);
            }else if(st.peek() == ch) {
                st.pop();
            }
        }
        // below way of forming string makes reverse string but,
        // using FOR-Each loop makes it easier to form string not in reverse form.

        // while(st.isEmpty())
        //     ans += st.pop();
        
        for(char ch : st) {
            ans += ch;
        }
        return ans;
    }
}
