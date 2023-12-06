// Time : O(n^3) Space : O(1)
public class naive {
    static void maxProductSubsequence(int arr[], int n, long res[]) { 
        // naive
        if(n<3)
            return;
        int maxProduct = 0;
        for(int i = 0; i<n-2; i++) {
            for(int j = i+1; j<n-1; j++) {
                if(arr[j] > arr[i]) {
                    for(int k = j+1; k<n; k++) {
                        if(arr[k] > arr[j]) {
                           int curProduct = arr[i] * arr[j] * arr[k];
                           if(curProduct > maxProduct) {
                                maxProduct = curProduct;
                                res[0] = arr[i];
                                res[1] = arr[j];
                                res[2] = arr[k];
                           }
                        }
                    }
                }
            }
        }
    }
}
