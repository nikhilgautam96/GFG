// Time : O(Log n) or O(H)
package Heap.Heap_Operations;
public class insert {
    int arr[];
    int heap_size, capacity;
    int parent(int i) { return (i - 1) / 2; }
    void Swap(int i, int j) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    void minHeapInsert(int k) {
        // Every Node should have a value less than all its descendents.
        if(heap_size == capacity) return;
        arr[heap_size++] = k;
        for(int i = heap_size-1; i!=0 && arr[parent(i)] > arr[i]; ) {
            Swap(i, parent(i));
            i = parent(i);
        }
    }
    void maxHeapInsert(int k) {
        // Every Node should have a value greater than all its descendents.
        if(heap_size == capacity) return;
        arr[heap_size++] = k;
        for(int i = heap_size-1; i!=0 && arr[parent(i)] < arr[i]; ) {
            Swap(i, parent(i));
            i = parent(i);
        }
    }
}
