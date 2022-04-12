// Naive :- 
// use extra space to store the elements of both the array and sort them
// and then put them back into a[] and b[].
// Time : O(n+m) + O((n+m)log(n+m)) + O(n+m) = O((n+m) log (n+m))
// Space : O(n+m).

// Using Insertion sort :-
//  use Merge sort's comparison method used in Merge method, 
// use two variables(i, j) for(a[], b[]) and put the smallest element after 
// comparing (a[i] > b[j]) into a[i] and the element from a[i] into b[j]. 
// Then just sort the b[] array for newly inserted element and this can be done 
// using insertion sort in O(m) time.
// Time : O(n * m), Space : O(1).


// Below Method :- "GAP Method"
// Time : O((n+m)log(n+m)), Space : O(1).
package Sorting;
public class merge_without_extra_space {
    public static int nextGap(int gap) {
        if(gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }
    public static void merge(long arr1[], long arr2[], int n, int m) {
        // GAP Method.
        int gap = nextGap(n + m);
        while(gap > 0) {
            int i = 0, j = gap;
            while(i<n+m-gap) {
                if(i < n) {
                    if(j>=n) {
                        if(arr1[i] > arr2[j-n]) {
                            swap(arr1, arr2, i, j-n);
                        }
                    }else if(arr1[i] > arr1[j]) {
                        swap(arr1, arr1, i, j);
                    }
                }else {
                    if(arr2[i-n] > arr2[j-n]) {
                        swap(arr2, arr2, i-n, j-n);
                    }
                }
                i++;
                j++;
            }
            gap = nextGap(gap);
        }
    }
    public static void swap(long a[], long b[], int i, int j) {
        long temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
}
