package Queue;
import java.util.*;
public class implement_stack_using_2_queue {
    // Logic 1 -->
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    void push(int a) {
        // In this logic Q1 always represents the elements of the stack.
        q2.add(a);
        while(!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    int pop() {
        if(q1.isEmpty())
            return -1;
        return q1.poll();
    }
    // Logic 2 -->
    // Queue<Integer> q1 = new LinkedList<Integer>();
    // Queue<Integer> q2 = new LinkedList<Integer>();
    // void push(int a) {
    //     if(q1.isEmpty()) {
    //         q1.add(a);
    //         while(!q2.isEmpty()) {
    //             q1.add(q2.poll());
    //         }
    //     }else {
    //         q2.add(a);
    //         while(!q1.isEmpty()) {
    //             q2.add(q1.poll());
    //         }
    //     }
    // }
    // int pop() {
    //     if(q1.isEmpty() && q2.isEmpty())
    //         return -1;
    //     if(q1.isEmpty())
    //         return q2.poll();
    //     return q1.poll();
    // }
}
