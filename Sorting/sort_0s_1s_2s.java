package Sorting;
public class sort_0s_1s_2s {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void segragate012(int arr[], int N){
        int j = -1, k = N;
        for(int i = 0; i<k; i++) {
            if(arr[i] == 0) {
                j++;
                swap(arr, i, j);
            }else if(arr[i] == 2) {
                k--;
                swap(arr, i, k);
                i--;
            }
        }
    }
}
