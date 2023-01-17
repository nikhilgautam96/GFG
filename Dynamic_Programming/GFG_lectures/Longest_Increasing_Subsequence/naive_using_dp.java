// Time : Theta(n ^ 2), Space : Theta(n)
package Dynamic_Programming.GFG_lectures.Longest_Increasing_Subsequence;
public class naive_using_dp {
    int LIS(int arr[], int n) {
        int lis[] = new int[n];
        for(int i = 0; i<n; i++) {
            lis[i] =  1;
            for(int j = 0; j<i; j++) {
                if(arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        int res = lis[0];
        for(int i = 1; i<n; i++) {
            res = Math.max(res, lis[i]);
        }
        return res;
    }
}
