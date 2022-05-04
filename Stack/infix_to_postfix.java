package Stack;
import java.util.Stack;
public class infix_to_postfix {
    public static boolean isOperand(char ch) {return Character.isLetterOrDigit(ch);}
    public static int precedenceOf(char ch) {
        switch(ch) {
            case '^' : return 3; case '*' : case '/' : return 2; 
            case '+' : case '-' : return 1; } return -1;
    }
    public static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        char s[] = exp.toCharArray();
        String postfix = "";
        for(char ch : s) {
            if(isOperand(ch)) {
                postfix += ch;
            }else {
                if(ch == '(') {
                    st.push(ch);
                }else if(ch == ')') {
                    while(!st.isEmpty() && st.peek() != '(') {
                        postfix += st.pop();
                    }
                    if(st.isEmpty())
                        return "Invalid Expression!";
                    st.pop();
                }else {
                    while(!st.isEmpty() && st.peek() != '(' && precedenceOf(ch) <= precedenceOf(st.peek())) {
                        postfix += st.pop();
                    }
                    st.push(ch);
                }
            }
        }
        while(!st.isEmpty()) { postfix += st.pop(); }
        return postfix;
    }
}
