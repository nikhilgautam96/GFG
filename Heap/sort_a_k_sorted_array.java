// Given an array of n elements, where each element is at most k away from its target position, 
// devise an algorithm that sorts in O(n log k) time. For example, let us consider k is 2, 
// an element at index 7 in the sorted array, can be at indexes 5, 6, 7, 8, 9 in the given array.

// Time : O(n * Log k)
package Heap;
import java.util.PriorityQueue;
public class sort_a_k_sorted_array {
    private static void sortK(int[] arr, int n, int k) { 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // O(k)
        for(int i = 0; i <= k; i++) {
            pq.add(arr[i]); 
        }
        int index = 0;
        // O(n-k * log k)
        for(int i = k + 1; i < n; i++) { 
            arr[index++] = pq.peek(); 
            pq.poll(); // O(log k)
            pq.add(arr[i]); 
        } 
        while(pq.isEmpty()==false) { 
            arr[index++] = pq.poll();
        }
    }
    public static void main(String[] args) { 
        int k = 3; 
        int arr[] = { 2, 6, 3, 12, 56, 8 }; 
        int n = arr.length; 
        sortK(arr, n, k); 
        System.out.println("Following is sorted array"); 
        printArray(arr, n); 
    }
    private static void printArray(int[] arr, int n) { 
        for(int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    }
}
