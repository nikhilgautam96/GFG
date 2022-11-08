package Heap;
import java.util.Collections;
import java.util.PriorityQueue;
public class Priority_Queue {
    public static void main(String args[]) {
        // MinHeap by default.
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        pq1.add(10);
        pq1.add(20);
        pq1.add(15);
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());// Printing and removing the top element from the PriorityQueue container
        System.out.println(pq1.peek());
        
        // To make it MaxHeap we use "Collections.reverseOrder()"
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq2.add(10);
        pq2.add(20);
        pq2.add(15);
                    // Above PriorityQueue is stored as following
                    //       20
                    //      /  \
                    //    10    15
        System.out.println(pq2.peek());
        System.out.println(pq2.poll());
                    // Post poll() PriorityQueue looks like
                    //       15
                    //      /  
                    //    10   
        System.out.println(pq2.peek());
    }
}
