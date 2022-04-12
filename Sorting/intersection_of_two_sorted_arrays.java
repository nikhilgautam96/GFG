package Sorting;
import java.util.*;
public class intersection_of_two_sorted_arrays {
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;
        while(i<n && j<m) {
            if(arr1[i] < arr2[j]) {
                i++;
            }else if(arr1[i] == arr2[j]) {
                if((intersection.size() > 0 && 
                        (arr1[i] != intersection.get(intersection.size()-1))) ||
                            intersection.size() == 0) {
                    intersection.add(arr1[i]);
                }
                i++;
                j++;
            }else {
                j++;
            }
        }
        return intersection;
    }
}
