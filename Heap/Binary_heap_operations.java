package Heap;
public class Binary_heap_operations {
    int[] harr;
    int capacity;
    int heap_size;
    Binary_heap_operations(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return (2 * i + 1); }
    int right(int i) { return (2 * i + 2); }

    // Function to extract minimum value in heap and then to store 
    // next minimum value at first index.
    int extractMin() {
        // Time : O(log n) or O(H) bcz of "MinHeapify".
        if(heap_size == 0) return -1;
        if(heap_size == 1) { heap_size--; return harr[0]; }
        
        int temp = harr[heap_size - 1];
        harr[heap_size - 1] = harr[0];
        harr[0] = temp;
        heap_size--;
        MinHeapify(0);
        return harr[heap_size];
    }
    void insertKey(int k) {
        // Time : O(log n) or O(H) bcz, in Complete Binary tree "H" = "Log N".
        if(heap_size == capacity) return;
        harr[heap_size++] = k;
        int p = parent(heap_size - 1);
        for(int i = heap_size-1; i > 0 && harr[i] < harr[p]; ) {
            int temp = harr[i];
            harr[i] = harr[p];
            harr[p] = temp;
            i = p;
            p = parent(i);
        }
    }
    void deleteKey(int i) {
        //Time : O(log n) for "decreaseKey" + O(log n) for "extractMin" = O(log n)
        if(heap_size <= 0 || i >= heap_size) return;
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }
    // Decrease-Key goes from = "i to 0"
    void decreaseKey(int i, int new_val) {
        // Time : O(log n) or O(H).
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }
    /* 
        This opereation is used as a Subroutine in many operations like 
        1. "Extract Minimum" and 
        2. "Build Heap" 
    */
    // MinHeapify goes from = "i to N"
    void MinHeapify(int i) {
        // Time : O(log n) or O(H),  
        // Space : O(H) in reursive approach, O(1) in iterative approach.
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[i]) smallest = l;
        if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
        if (smallest != i) {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            MinHeapify(smallest);
        }
    }
}
