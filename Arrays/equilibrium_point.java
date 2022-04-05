public class equilibrium_point {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        int lsum = 0, sum = 0;
        for(int i = 0; i<n; i++)
            sum += arr[i];
        for(int i = 0; i<n; i++) {
            sum -= arr[i];
            if(lsum == sum)
                return i+1;
            lsum += arr[i];
        }
        return -1;
    }
}
