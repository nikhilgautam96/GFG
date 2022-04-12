package Sorting.All_Sorting_Techniques;
public class insertion_sort {
    static void insert(int arr[],int i) {
        for(int j = i; j>0; j--) {
            if(arr[j] < arr[j-1]) {
                //swap
                arr[j] = arr[j] ^ arr[j-1];
                arr[j-1] = arr[j] ^ arr[j-1];
                arr[j] = arr[j] ^ arr[j-1];
            }
        }
    }
    //Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n) {
        for(int i = 1; i<n; i++) {
            insert(arr, i);
        }
    }
}
