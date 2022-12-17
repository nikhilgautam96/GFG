// Time : O(n Log n) For Sorting + O(n) for counting swaps as we visit every element exactly once.
package Graph.GFG_Problems;
import java.util.*;
public class Minimum_Swaps {
    class Pair implements Comparable<Pair> {
        int num, idx;
        Pair(int num, int idx) {
            this.num = num; this.idx =idx;
        }
        public int compareTo(Pair p) {
            return (this.num - p.num);
        }
    }
    public int minSwaps(int nums[]) {
        int n = nums.length;
        Pair arr[] = new Pair[n];
        // We sort the nums array and store the original index of elements as well.
        for(int i = 0; i<n; i++) {
            arr[i] = new Pair(nums[i], i);
        }
        Arrays.sort(arr);
        boolean visited[] = new boolean[n];
        int ans = 0;
        for(int i = 0; i<n; i++) {
            if(!visited[i] && arr[i].idx != i) {
                int j = i;
                int count = 0;
                while(!visited[j]) {
                    visited[j] = true;
                    j = arr[j].idx;
                    count++;
                }
                ans += Math.max(0, count - 1);
            }
        }
        return ans;
    }
}
