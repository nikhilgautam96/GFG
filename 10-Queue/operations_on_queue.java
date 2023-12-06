package Queue;
import java.util.Queue;
public class operations_on_queue {
    void enqueue(Queue<Integer> q, int x){
        q.add(x);
    }
    void dequeue(Queue<Integer> q){
        q.poll();
    }
    int front(Queue<Integer> q){
        return q.peek();
    }
    String find(Queue<Integer> q, int x){
        if(q.contains(x))
            return "Yes";
        return "No";
        // Iterator<Integer> it = q.iterator();
        // while(it.hasNext()) {
        //     if(it.next() == x) {
        //         return "Yes";
        //     }
        // }
        // return "No";
    }
}