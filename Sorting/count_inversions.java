// Given an array of integers. Find the Inversion Count in the array. 

// Inversion Count: For an array, inversion count indicates how far (or close) 
// the array is from being sorted. If array is already sorted then the 
// inversion count is 0. If an array is sorted in the reverse order then 
// the inversion count is the maximum. 

// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
package Sorting;
public class count_inversions {
    public static long merge(long a[], int low, int mid, int high) {
        int n1 = mid-low+1, n2 = high-mid;
        long left[] = new long[n1];
        long right[] = new long[n2];
        for(int i = 0; i<n1; i++) {
            left[i] = a[low+i];
        }
        for(int i = 0; i<n2; i++) {
            right[i] = a[mid+1+i];
        }
        int i = 0, j = 0, k = low;
        long count = 0;
        while(i<n1 && j<n2) {
            if(left[i] > right[j]) {
                a[k] = right[j++];
                count += (n1-i);
            }else {
                a[k] = left[i++];
            }
            k++;
        }
        while(i<n1) {
            a[k++] = left[i++];
        }
        while(j<n2) {
            a[k++] = right[j++];
        }
        return count;
    }
    public static long mergeSort(long a[], int low, int high) {
        long count = 0;
        if(low < high) {
            int mid = low + (high - low)/2;
            count += mergeSort(a, low, mid);
            count += mergeSort(a, mid+1, high);
            count += merge(a, low, mid, high);
        }
        return count;
    }
    static long inversionCount(long arr[], long N) {
        return mergeSort(arr, 0, (int)(N-1));
    }
}
