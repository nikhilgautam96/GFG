package Heap;
import java.util.*;
public class k_most_occuring_elements {
    int kMostFrequent(int arr[], int n, int k){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i : arr) {
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i)+1);
            }else {
                hm.put(i, 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int x = e.getValue();
            if(k > 0) {
                pq.add(x);
                k--;
            }else if(pq.peek() < x){
                pq.poll();
                pq.add(x);
            }
        }
        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}
