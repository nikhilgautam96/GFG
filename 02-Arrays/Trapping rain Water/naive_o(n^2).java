// Time : O(n)
// Space : O(1)
class trapping_rain_water {
    public static int rainWater(int arr[], int n) {
        int totalWater = 0;
        for(int i = 1; i<n-1; i++) {
            int lmax = 0, rmax = 0;
            for(int j = 0; j<=i; j++) {
                lmax = Math.max(arr[j], lmax);
            }
            for(int j = n-1; j>=i; j--) {
                rmax = Math.max(arr[j], rmax);
            }
            totalWater += Math.min(lmax, rmax) - arr[i];
        }
        return totalWater;
    }
}
