package Sorting;
public class binary_array_sorting {
    static void swap(int a[], int i, int j) {
        if(i == j)
            return;
        if(a[j] == 1) {
            a[i] = 1;
        }
        a[j] = 0;
    }
    static void binSort(int A[], int N) {
        int j = -1;
       for(int i = 0; i<N; i++) {
           if(A[i] == 0) {
               ++j;
               swap(A, i, j);
           }
       }
    }
}
