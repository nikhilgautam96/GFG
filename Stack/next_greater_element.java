package Stack;
import java.util.Stack;
public class next_greater_element {
    public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Long> st = new Stack<>();
        for(int i = arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
            }
            Long temp = arr[i];
            arr[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(temp);
        }
        return arr;
    }
}
