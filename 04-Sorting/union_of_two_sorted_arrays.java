package Sorting;
import java.util.*;
public class union_of_two_sorted_arrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while(i<n && j<m) {
            if(arr1[i] <= arr2[j]) {
                if(union.size() > 0) {
                    if(arr1[i] != union.get(union.size()-1)) {
                        union.add(arr1[i]);
                    }
                }else {
                    union.add(arr1[i]);
                }
                i++;
            }else {
                if(union.size() > 0) {
                    if(arr2[j] != union.get(union.size()-1)) {
                        union.add(arr2[j]);
                    }
                }else {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n) {
            if(arr1[i] != union.get(union.size()-1)) {
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<m) {
            if(arr2[j] != union.get(union.size()-1)) {
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
}
