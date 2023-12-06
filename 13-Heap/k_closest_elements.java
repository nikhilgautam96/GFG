// Time : O(n Log K)
package Heap;
import java.util.*;
class Pair { 
    Integer key, value;
    public Pair(Integer key, Integer value) { 
        this.key = key; 
        this.value = value; 
    }
}
public class k_closest_elements {
    public static void printKClosest(int arr[], int n, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() { 
            public int compare(Pair p1, Pair p2) { 
                return p2.value.compareTo(p1.value); 
            } 
        }); 
        for(int i = 0; i < k; i++) { 
            pq.offer(new Pair(arr[i], Math.abs(arr[i] - x))); 
        }
        for(int i = k; i < n; i++) { 
            int diff = Math.abs(arr[i] - x);  
            if(pq.peek().value > diff) {
                pq.poll(); 
                pq.offer(new Pair(arr[i], diff)); 
            }
        }
        while(!pq.isEmpty()) { 
            System.out.print(pq.poll().value + " ");
        }
    }
}
