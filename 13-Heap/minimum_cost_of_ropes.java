package Heap;
import java.util.PriorityQueue;
public class minimum_cost_of_ropes {
    long minCost(long arr[], int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long i : arr) {
            pq.add(i);
        }
        long sum = 0;
        while(pq.size() > 1) {
            long x = pq.poll(), y = pq.poll();
            sum += x+y;
            pq.add(x+y);
        }
        return sum;
    }
}
