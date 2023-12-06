// Time : O(n * log n)
package Greedy.lectures;
import java.util.*;
public class Fractional_Knapsack_problem {
    class Item implements Comparable<Item> {
        int val, wt;
        Item(int v, int w) {
            val = v; wt = w;
        }
        @Override
        public int compareTo(Item i) {
            // (i.val / i.wt) - (this.val / this.wt) >= 0  --> This object should appear first.
            return this.wt * i.val - i.wt * this.val;
        }
    }
    double frac_knapsack(Item arr[], int target) {
        Arrays.sort(arr);
        double res = 0.0d;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i].wt <= target) {
                res += arr[i].val;
                target -= arr[i].wt;
            } else {
                res += ((arr[i].val * (double)target)/ (double)arr[i].wt );
                // now "target = 0" so we can end our computation.
                break;
            }
        }
        return res;
    }
}
