// Time : O(n)
// Space : O(1)
class trapping_rain_water {
    public static int rainWater(int arr[], int n) {
        int low = 0, high = n-1, lmax = 0, rmax = 0, totalWater = 0;
        while(low < high) {
            if(arr[low] <= arr[high]) {
                if(arr[low] >= lmax) {
                    lmax = arr[low];
                }else {
                    totalWater += lmax - arr[low];
                }
                low++;
            } else {
                if(arr[high] >= rmax) {
                    rmax = arr[high];
                }else {
                    totalWater += rmax - arr[high];
                }
                high--;
            }
        }
        return totalWater;
    }
}
