package Stack;
import java.util.Stack;
public class paranthesis_checker {
    static boolean ispar(String x) {
        Stack<Character> st = new Stack<>();
        char s[] = x.toCharArray();
        for(char ch : s) {
            if(st.isEmpty()) {
                st.push(ch);
            }else if((ch == '}' && st.peek() == '{') || 
            (ch == ']' && st.peek() == '[') || (ch == ')' && st.peek() == '(')) {
                st.pop();
            }else if(ch == '}' || ch == ']' || ch == ')') {
                return false;
            }else {
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
