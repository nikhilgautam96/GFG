package Queue;
import java.util.*;
public class reverse_first_k_elements_of_a_queue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<k; i++) {
          st.push(q.poll());
        }
        while(!st.empty())  {
          q.add(st.pop());
        }
        int n = q.size();
        for(int i = 0;i<n-k; i++) {
          q.add(q.poll());
        }
        return q;
    }
}
