public class rotate_array {
    public static void arrayReversal(int arr[], int s, int e) {
        while(s<e) {
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
     }
     //Function to rotate an array by d elements in counter-clockwise direction. 
     static void rotateArr(int arr[], int d, int n) {
         arrayReversal(arr, 0, d-1);
         arrayReversal(arr, d, n-1);
         arrayReversal(arr, 0, n-1);
     }
}
