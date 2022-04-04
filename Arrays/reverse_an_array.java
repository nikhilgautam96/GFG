public class reverse_an_array {
    public static void arrayReversal(int arr[],int sizeOfArray) {
       int s = 0, e = sizeOfArray-1;
       while(s<e) {
           int temp = arr[s];
           arr[s++] = arr[e];
           arr[e--] = temp;
       }
    }
}
