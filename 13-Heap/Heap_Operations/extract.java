// Time : O(log n)
package Heap.Heap_Operations;
public class extract {
    int arr[];
    int heap_size; // Tells Number of elements in the Heap.
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return (2 * i + 1); }
    int right(int i) { return (2 * i + 2); }
    void Swap(int i, int j) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    heapify ob = new heapify(); 
    int extractMin() {
        if(heap_size == 0) return Integer.MAX_VALUE;
        if(heap_size == 1) { heap_size--; return arr[0]; }
        Swap(0, heap_size-1);
        heap_size--;
        ob.minHeapify(0); //O(log n)
        return arr[heap_size];
    }
    int extractMax() {
        if(heap_size == 0) return Integer.MIN_VALUE;
        if(heap_size == 1) { heap_size--; return arr[0]; }
        Swap(0, heap_size-1);
        heap_size--;
        ob.maxHeapify(0); //O(log n)
        return arr[heap_size];
    }
}
