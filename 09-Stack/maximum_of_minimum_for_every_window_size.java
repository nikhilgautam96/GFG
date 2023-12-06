package Stack;
import java.util.Stack;
public class maximum_of_minimum_for_every_window_size {
    static int[] maxOfMin(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int left[] = new int[n];
        int right[] = new int[n];
        for(int i = 0; i<n; i++) {
            right[i] = n;
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                right[st.pop()] = i;
            }
            left[i] = (st.isEmpty())? -1 : (arr[i] == arr[st.peek()]) ? left[st.peek()] : st.peek();
            st.push(i);
        }
        int ans[] = new int[n+1];
        for(int i = 0; i<n; i++) {
            int windowSize = right[i] - left[i] - 1;
            ans[windowSize] = Math.max(ans[windowSize], arr[i]);
        }
        for(int i = n-1; i>0; i--) {
            ans[i] = Math.max(ans[i], ans[i+1]);
        }
        int res[] = new int[n];
        for(int i = 0; i<n; i++)
            res[i] = ans[i+1];
        return res;
    }
}
