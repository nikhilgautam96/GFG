// Time : O(Log n)
package Heap.Heap_Operations;
public class delete_key {
    int arr[];
    int heap_size, capacity;
    int parent(int i) { return (i - 1) / 2; }
    void Swap(int i, int j) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    heapify ob = new heapify(); 
    void deleteKey(int i) {
        //Time : O(log n) for "decreaseKey" + O(log n) for "extractMin" = O(log n)
        if(heap_size <= 0 || i >= heap_size) return;
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }
    void decreaseKey(int index, int new_val) {
        // Time : O(log n) or O(H).
        arr[index] = new_val;
        while (index != 0 && arr[parent(index)] > arr[index]) {
            Swap(index, parent(index));
            index = parent(index);
        }
    }
    int extractMin() {
        if(heap_size == 0) return Integer.MAX_VALUE;
        if(heap_size == 1) { heap_size--; return arr[0]; }
        Swap(0, heap_size-1);
        heap_size--;
        ob.minHeapify(0); //O(log n)
        return arr[heap_size];
    }
}
