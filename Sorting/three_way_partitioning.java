package Sorting;
public class three_way_partitioning {
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void threeWayPartition(int array[], int a, int b) {
        int j = -1, n = array.length;
        for(int i = 0; i<n; i++) {
            if(array[i] < a) {
                j++;
                swap(array, i, j);
            }
        }
        for(int i = j+1; i<n; i++) {
            if(array[i] >= a && array[i] <= b) {
                j++;
                swap(array, i, j);
            }
        }
    }
}
