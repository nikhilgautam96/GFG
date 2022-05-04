package Stack;
import java.util.Stack;
public class evaluate_postfix {
    public static boolean isOperand(char ch) {return Character.isLetterOrDigit(ch);}
    public static int calculate(int a, int b, char ch) {
        switch(ch) {
            case '*' : return b * a;
            case '/' : return b / a; 
            case '+' : return b + a;
            case '-' : return b - a;
        }
        return -1;
    }
    public static int evaluatePostFix(String S) {
        Stack<Integer> st = new Stack<>();
        char s[] = S.toCharArray();
        for(char ch : s) {
            if(isOperand(ch)) 
                st.push(ch-48);
            else {
                st.push(calculate(st.pop(), st.pop(), ch));
            }
        }
        return st.pop();
    }
}
