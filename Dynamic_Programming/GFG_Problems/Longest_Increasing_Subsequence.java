// Time : O(n * log n),  Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class Longest_Increasing_Subsequence {
    static int binarySearch(int tail[], int x, int l, int r) {
        while(l<r) {
            int mid = l + (r-l)/2;
            if(x > tail[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }
    static int longestSubsequence(int size, int a[]) {
        int tail[] = new int[size];
        tail[0] = a[0];
        int len = 1;
        for(int i = 1; i<size; i++) {
            if(a[i] > tail[len-1]) {
                tail[len++] = a[i];
            } else {
                int idx = binarySearch(tail, a[i], 0, len-1);
                tail[idx] = a[i];
            }
        }
        return len;
    }
}
