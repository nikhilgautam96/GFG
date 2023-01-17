// Time : O(2 ^ n), Space : O(n) bcz of recursion stack.
package Dynamic_Programming.GFG_lectures;
import java.util.*;
public class Generate_all_Subsequence_of_array {
    void print_subsequence(int arr[], int i, ArrayList<Integer> sequence) {
        if(i == arr.length) {
            if(sequence.size() > 0) {
                // to not print empty list all the time we put the condition.
                System.out.println(sequence);
            } else {
                // We will not add current index element.
                print_subsequence(arr, i+1, sequence);
                // now we will add current index element.
                sequence.add(arr[i]);
                print_subsequence(arr, i+1, sequence);
                // now we can remove the added element while backtracking.
                sequence.remove(sequence.size() - 1);
            }
            return;
        }
    }
}
