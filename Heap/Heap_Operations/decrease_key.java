// Time : O(Log n)
package Heap.Heap_Operations;
public class decrease_key {
    int arr[];
    int heap_size, capacity;
    int parent(int i) { return (i - 1) / 2; }
    void Swap(int i, int j) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    void decreaseKey(int index, int new_val) {
        // Time : O(log n) or O(H).
        arr[index] = new_val;
        while (index != 0 && arr[parent(index)] > arr[index]) {
            Swap(index, parent(index));
            index = parent(index);
        }
    }
}
