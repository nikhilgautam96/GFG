// Time : O(n log n), Space : O(1)
package Greedy.Problems;
import java.util.*;
public class Fractional_knapsack {
    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
    class MyComp implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            return b.value * a.weight - a.value * b.weight;
        }
    }
    double fractionalKnapsack(int W, Item arr[], int n) {
        // Sort arr[] according to (value/weight) is descending order.
        Arrays.sort(arr, new MyComp());
        double ans = 0.0d;
        for(int i = 0; i<n; i++) {
            if(arr[i].weight <= W) {
                W -= arr[i].weight;
                ans += arr[i].value;
            }else {
                ans += (W * (double)arr[i].value) / arr[i].weight;
                break; // since now W = 0;
            }
        }
        return ans;
    }
}
