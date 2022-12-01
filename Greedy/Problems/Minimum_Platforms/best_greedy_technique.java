// Time : O(n * log n), Space : O(1)
package Greedy.Problems.Minimum_Platforms;
import java.util.*;
public class best_greedy_technique {
    int minimumPlatform(int arrival[], int dept[], int n) {
        Arrays.sort(arrival);
        Arrays.sort(dept);
        int i = 1, j = 0;
        int platform = 1, minPlatform = 1;
        while(i<n && j<n) {
            if(arrival[i] > dept[j]) {
                platform--;
                j++;
            } else if(arrival[i] <= dept[j]) {
                platform++;
                i++;
            }
            minPlatform = Math.max(minPlatform, platform);
        }
        return minPlatform;
    }
}
