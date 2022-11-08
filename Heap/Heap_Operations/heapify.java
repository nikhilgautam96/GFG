// Time : O(log n)
package Heap.Heap_Operations;
public class heapify {
    // In heapify we place the element at index 'i' to its correct position in the Heap.
    int arr[];
    int heap_size; // Tells Number of elements in the Heap.
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return (2 * i + 1); }
    int right(int i) { return (2 * i + 2); }
    void Swap(int i, int j) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    void minHeapify(int i) {
        while(true) {
            int smallest = i;
            int l = left(i), r = right(i);
            if(l < heap_size && arr[l] < arr[smallest]) smallest = l;
            if(r < heap_size && arr[r] < arr[smallest]) smallest = r;
            if(smallest != i) {
                Swap(i, smallest);
                i = smallest;
            }else {
                break;
            }
        }
    }
    void maxHeapify(int i) {
        while(true) {
            int largest = i;
            int l = left(i), r = right(i);
            if(l < heap_size && arr[l] > arr[largest]) largest = l;
            if(r < heap_size && arr[r] > arr[largest]) largest = r;
            if(largest != i) {
                Swap(i, largest);
                i = largest;
            }else {
                break;
            }
        }
    }
}
