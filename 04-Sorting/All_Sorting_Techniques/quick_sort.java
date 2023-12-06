package Sorting.All_Sorting_Techniques;
public class quick_sort {
    //Function to sort an array using quick sort algorithm.
    public static void swap(int arr[], int i, int j) {
        // The below step prevents the Value at the index from becoming "0" 
        // as "arr[i] ^ arr[j]" will be "0" for "i == j".
        if(i == j)
            return;
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    static void quickSort(int arr[], int low, int high) {
        if(low >= high)
            return;
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot + 1, high);
    }
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high], j = low-1;
        for(int i = low; i <= high; i++) {
            if(arr[i] <= pivot) {
                ++j;
                swap(arr, i, j);
                
            }
        }
        // "j" will represent the index of Pivot element.
        return j;
    }
}
