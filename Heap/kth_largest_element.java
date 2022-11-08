package Heap;
import java.util.PriorityQueue;
public class kth_largest_element {
    public static int KthLargest(int arr[], int n, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i<k; i++) {
            minHeap.add(arr[i]);
        }
        for(int i = k; i<n; i++) {
            if(minHeap.peek() < arr[i]) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.peek();
    }
}
