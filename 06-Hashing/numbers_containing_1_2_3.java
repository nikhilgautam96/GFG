// Given an array arr[] of n numbers. The task is to print only those numbers 
// whose digits are from set {1,2,3}.

// Example 1:
// Input:
// n = 3
// arr[] = {4,6,7}
// Output: -1
// Explanation: No elements are there in the 
// array which contains digits 1, 2 or 3.

// Example 2:
// Input:
// n = 4
// arr[] = {1,2,3,4}
// Output: 1 2 3
// Explanation: 1, 2 and 3 are the only 
// elements in the array which conatins 
// digits as 1, 2 or 3.

package Hashing;
import java.util.HashMap;
public class numbers_containing_1_2_3 {
    static HashMap<Integer, Integer> mp = new HashMap<>();
    public static void findAll() {
        int i = 1;
        for( ; i<1000000; i++) {
            String s = Integer.toString(i);
            if(s.contains("0") || s.contains("4") || s.contains("5") ||
            s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9")) {
                continue;
            }
            // given number has only {1, 2, 3} in it.
            mp.put(i, 1);
        }
    }
}
