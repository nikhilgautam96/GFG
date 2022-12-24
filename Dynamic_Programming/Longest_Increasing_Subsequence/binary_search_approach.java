// Time : O(n * log n), Space : O(n)
package Dynamic_Programming.Longest_Increasing_Subsequence;
public class binary_search_approach {
    int ceilIndex(int tail[], int num, int l, int r) {
        while(l<r) {
            int mid = l + (r-l)/2;
            if(tail[mid] >= num) {
                r = mid;
            }else {
                l = mid+1;
            }
        }
        return r;
    }
    int LIS(int arr[], int n) {
        int tail[] = new int[n];
        int len = 1;
        tail[0] = arr[0];
        for(int i = 1; i<n; i++) {
            if(arr[i] > tail[len-1]) {
                tail[len++] = arr[i];
            } else {
                int c = ceilIndex(tail, arr[i], 0, len-1);
                tail[c] = arr[i];
            }
        }
        return len;
    }
}
