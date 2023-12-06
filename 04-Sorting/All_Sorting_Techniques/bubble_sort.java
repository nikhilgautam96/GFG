package Sorting.All_Sorting_Techniques;
public class bubble_sort {
    public static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n) {
	    boolean swapDone = false;
	    for(int i = 0; i<n; i++) {
	        for(int j = 0; j<n-i-1; j++) {
	            if(arr[j] > arr[j+1]) {
	                swap(arr, j, j+1);
	                swapDone = true;
	            }
	        }
	        if(swapDone == false)
	            return;
	    }
    }
}
