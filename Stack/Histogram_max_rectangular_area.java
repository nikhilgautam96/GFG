// concept based on - "next greater element."
package Stack;
import java.util.Stack;
public class Histogram_max_rectangular_area {
    public static long getMaxArea(long hist[], long n) {
        Stack<Integer> st = new Stack<>();
        long maxArea = Integer.MIN_VALUE;
        int i = 0;
        while(i < n) {
            while(!st.isEmpty() && hist[i] < hist[st.peek()]) {
                long height = hist[st.pop()];
                int leftIndex = (st.isEmpty()) ? i : (i - st.peek() - 1);
                maxArea = Math.max(maxArea, (height * leftIndex));
            }
            st.push(i++);
        }
        while(!st.isEmpty()) {
            long height = hist[st.pop()];
            int leftIndex = (st.isEmpty()) ? i : (i - st.peek() - 1);
            maxArea = Math.max(maxArea, (height * leftIndex));
        }
        return maxArea;
    }
}
