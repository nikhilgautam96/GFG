public class wave_array {
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void convertToWave(int arr[], int n){
        // since the array is sorted.
        for(int i = 0, j = 1; i<n && j<n; i+=2, j+=2) {
            swap(arr, i, j);
        }
    }
}
