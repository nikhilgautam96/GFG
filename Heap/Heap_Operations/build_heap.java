// Time : O(n)
package Heap.Heap_Operations;
public class build_heap {
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return (2 * i + 1); }
    int right(int i) { return (2 * i + 2); }
    void Swap(int arr[], int i, int j) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    void buildHeap(int arr[], int n) {
        for(int i = (n-2)/2; i >= 0; i--) {
            minHeapify(arr, n, i);
        }
    }
    void minHeapify(int arr[], int n, int i) {
        while(true) {
            int smallest = i;
            int l = left(i), r = right(i);
            if(l < n && arr[l] < arr[smallest]) smallest = l;
            if(r < n && arr[r] < arr[smallest]) smallest = r;
            if(smallest != i) {
                Swap(arr, i, smallest);
                i = smallest;
            }else {
                break;
            }
        }
    }
}
