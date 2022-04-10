// Given an array arr[] of size N and an element k. The task is to find all 
// elements in array that appear more than n/k times.

package Searching;
import java.util.*;
public class count_elements_with_more_than_k_occurence {
    public int countOccurence(int[] arr, int n, int k) {

        // below method prints elements in order of their 1st occurence 
        // more than n/k times.

        int check = n/k + 1, count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<n; i++) {
            if(hm.containsKey(arr[i]) == true) {
                int freq = hm.get(arr[i]) + 1;
                if(freq == check) {
                    hm.put(arr[i], -1);
                    count++;
                }else if(freq != 0){
                    hm.put(arr[i], freq);
                }
            }else {
                hm.put(arr[i], 1);
            }
        }
        return count;
    }
}
