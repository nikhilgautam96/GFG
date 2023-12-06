package Queue;
import java.util.*;
public class queue_reversal {
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()) {
            st.push(q.poll());
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        return q;
    }
}
