package Heap;
import java.util.*;
public class median_of_a_stream {
    /**
     * Method 1 : Using Temporary Sorted Array.
     *          - O(n ^ 2)
     */
    /**
     * Method 2 : Using Augmented BST. 
     *          - O(n * log n)
     */
    /**
     * Method 3 : Using Min and Max Heaps.
     *          - O(n * log n)
     *          - Heap is Cache Friendly, so we should prefer this solution as the best wrt time.
     */
    public static void printMedians(int arr[],int n) {
        PriorityQueue<Integer> g=new PriorityQueue<Integer>();
        PriorityQueue<Integer> s=new PriorityQueue<Integer>(Collections.reverseOrder());
        s.add(arr[0]);
        System.out.print(arr[0]+" ");
        for(int i=1; i<n; i++) {
            int x = arr[i];
            if(s.size()>g.size()) {
                if(s.peek()>x) {
                    g.add(s.poll());
                    s.add(x);
                }else g.add(x);
                System.out.print(s.peek()+" ");
            }else {
                if(x<=s.peek()) {
                    s.add(x);
                }else {
                    g.add(x);
                    s.add(g.poll());
                }
                System.out.print(((double)(s.peek()+g.peek())/2)+" ");
            }
        }
    }
    public static void main(String args[]) {
        int keys[] = { 12, 15, 10, 5, 8, 7, 16};
        printMedians(keys,7);
    }
}
