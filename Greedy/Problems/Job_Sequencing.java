// Time : O(N * log N)
// Space : O(M) , M = max Deadline.
package Greedy.Problems;
import java.util.*;
public class Job_Sequencing {
    int parent[];
    int find(int x) {
        if(parent[x] == x)
            return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }
    void union(int u, int v) {
        parent[v] = u;
    }
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        int maxDeadline = 0;
        for(int i=0; i<n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        parent = new int[maxDeadline + 1];
        for(int i = 0; i<parent.length; i++) {
            parent[i] = i;
        }
        int maxProfit = 0, count = 0;
        for(Job x : arr) {
            int availableSlot = find(x.deadline);
            if(availableSlot > 0) {
                maxProfit += x.profit;
                count++;
                union(find(availableSlot - 1), availableSlot);
            }
        }
        return new int[]{count, maxProfit};
    }
}
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
