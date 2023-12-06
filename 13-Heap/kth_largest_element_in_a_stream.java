package Heap;
import java.util.PriorityQueue;
public class kth_largest_element_in_a_stream {
    public void kthLargest(int arr[], int n, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i<n; i++) {
            if(i < k) {
                minHeap.add(arr[i]);
            }else {
                if(minHeap.peek() < arr[i]) {
                    minHeap.poll();
                    minHeap.add(arr[i]);
                }
            }
            if(i < k-1) {
                System.out.print("-1 ");
            }else {
                System.out.print(minHeap.peek() + " ");
            }
        }
    }
}
