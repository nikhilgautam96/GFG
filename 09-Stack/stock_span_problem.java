package Stack;
import java.util.Stack;
public class stock_span_problem {
    public static int[] calculateSpan(int price[], int n) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i = 0; i<n; i++) {
            int count = 0;
            while(!st.isEmpty() && price[i] >= price[st.peek()]) {
                count += ans[st.pop()];
            }
            ans[i] = count + 1;
            st.push(i);
        }
        return ans;
    }
}
