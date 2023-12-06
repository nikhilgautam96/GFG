package Stack;
import java.util.Stack;
public class get_min_at_pop {
    public static Stack<Integer> _push(int arr[],int n) {
        Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        for(int i : arr) {
            min = Math.min(min, i);
            st.push(min);
        }
        return st;
    }
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s) {
        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
}
