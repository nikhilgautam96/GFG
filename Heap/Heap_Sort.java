// To sort an array in increasing order we use MaxHeap.
// To Sort an array in Decreasing order we use MinHeap.
package Heap;
public class Heap_Sort {
    // Time : O(n * Log n)
    public void heapSort(int arr[], int n) {
        buildHeap(arr, n);
        for(int i = n-1; i>0; i--) {
            // We do extract_max for all the elements.
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, i, 0);
        }
    }
    // BuildHeap Time : O(n)
    void buildHeap(int arr[], int n) {
        for(int i = (n-2)/2; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }
    // Heapify Time : O(log n).
    void maxHeapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if(l < n && arr[l] > arr[largest])
            largest = l;
        if(r < n && arr[r] > arr[largest])
            largest = r;
        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, n, largest);
        }
    }
}
