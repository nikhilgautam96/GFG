public class minimum_adjacent_diff_in_a_circular_array {
    public static int minAdjDiff(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++) {
            int absDiff = (int)Math.abs(arr[i] - arr[(i+1)%n]);
            min = Math.min(min, absDiff);
        }
        return min;
    }
}
