package Heap;
import java.util.*;
public class kth_smallest_element {
    public static int kthSmallest(int arr[], int n, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<k; i++) {
            maxHeap.add(arr[i]);
        }
        for(int i = k; i<n; i++) {
            if(maxHeap.peek() > arr[i]) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        return maxHeap.peek();
    }
}
