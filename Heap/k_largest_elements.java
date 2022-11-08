package Heap;
import java.util.*;
public class k_largest_elements {
    /**
     * Method 1 - Sorting
     *     - Sort the array            = O(n Log n)
     *     - print the last K elements = O(k)
     * Time : O(n * Log n)
     */
     /**
      * Method 2 - Using Max-Heap
      *     - build a maxHeap of all the elements = O(n)
      *     - extract the first k elements        = O(k * log n)
      *    {the order does not matter so we directly print from array instead of using Extract-Max}
      * Time : O(n + (k * Log n))
      */
      /**
       * Method 3 - using Min-Heap      "Best method"
       *   - we build a min-heap of first k elements   = O(k)
       *   - compare and replace the (n-k) elements with the peak element of heap = O(n-k * log k)
       *   - print the min-heap = O(k) { order does not matter }
       * Time : O(k + (n-k * Log k))
       */

      public static void firstKElements(int arr[], int n, int k) {
          PriorityQueue<Integer> minHeap = new PriorityQueue<>();
          for(int i = 0; i < k; i++) {
              minHeap.add(arr[i]);
          }
          for(int i = k; i < n; i++) {
            if (minHeap.peek() < arr[i]){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
          }
          Iterator iterator = minHeap.iterator(); 
          while(iterator.hasNext()) { 
              System.out.print(iterator.next() + " "); 
          } 
      }
}
