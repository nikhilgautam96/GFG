// Time : O(2 ^ N), bcz every elemet is either included or not included.
package Backtracking.Problems;
import java.util.*;
public class Unique_Subsets {
    static void generateSubsets(int start, int arr[], ArrayList<ArrayList<Integer>> ans, 
                ArrayList<Integer> temp, int n) {
        ans.add(new ArrayList<>(temp));
        for(int i = start; i < n; i++) {
            // since arr[] is sorted so to find duplications, 
            // we need to check current element with previous ones.
            if(i > start && arr[i] == arr[i-1]) {
                // Then an subset including the current element is alrady there.
                continue;
            }
            // we either include the current element or exclude.
            // let's include the element.
            temp.add(arr[i]);
            generateSubsets(i+1, arr, ans, temp, n);
            // let's exclude the element.
            temp.remove(temp.size() - 1);
        }
    }
    //Function to find all possible unique subsets.
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n) {
        // "arr" is already sorted.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        generateSubsets(0, arr, ans, new ArrayList<Integer>(), n);
        // the "ans" has all subsets including the one where no element is selected, ie. (),
        // So we need to remove the extra "()" empty subset that is included at the begining.
        ans.remove(0);
        return ans;
    }
}
