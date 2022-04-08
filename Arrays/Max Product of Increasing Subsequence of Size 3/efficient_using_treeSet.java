// Time : O(n*Log(n)) to get maximum value left of curr element using TreeSet.
//          O(n) to get maximum on right of curr element.
//          o(n) to find the maximum product using above two precomputations.
// therefore "Time complexity = O(N * Log N)"
//  space : O(N).

import java.util.*;
public class efficient_using_treeSet {
    // Function to find subsequence of size 3 with maximum product
    // arr[]: input array
    // n: size of array
    // res[]: array contianing the subsequence of size 3 with max product
    static void maxProductSubsequence(int arr[], int n, long res[]) { 
        if(n < 3) {
            return;
        }
        int maxRight[] = new int[n];
        maxRight[n-1] = 0;
        int max = arr[n-1];
        for(int i = n-2; i>0; i--) {
            if(max > arr[i]) {
                maxRight[i] = max;
            } else {
                max = arr[i];
            }
        }
        long maxProduct = 0; 
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(arr[0]);
        for(int i = 1; i<n-1; i++) {
            if(ts.lower(arr[i]) != null) {
                long prod = ((long)arr[i] * ts.lower(arr[i]) * maxRight[i]);
                if(prod > maxProduct) {
                    maxProduct = prod;
                    res[0] = ts.lower(arr[i]);
                    res[1] = arr[i];
                    res[2] = maxRight[i];
                }
            }
            ts.add(arr[i]);
        }
    }
}
