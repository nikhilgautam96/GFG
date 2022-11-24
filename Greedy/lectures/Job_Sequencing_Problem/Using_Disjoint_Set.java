// Time : O(N * Log M), Space : O(M),  where M = "Maximum Deadline"
package Greedy.lectures.Job_Sequencing_Problem;
import java.util.*;
public class Using_Disjoint_Set {
    class Job {
        int id, deadline, profit;
        Job(int id, int deadline, int profit) {
            this.id = id; this.deadline = deadline; this.profit = profit;
        }
    }
    int parent[];
    int find(int x) {
        if(x == parent[x])
            return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }
    void union(int u, int v) {
        parent[v] = u;
    }
    void jobSequencing(Job arr[], int n) {
        Arrays.sort(arr, (a, b)->(b.profit - a.profit));
        int maxDeadline = 0;
        for( int i = 0; i<n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        parent = new int[maxDeadline + 1];
        for(int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }
        int countJobs = 0, maxProfit = 0;
        int sequence[] = new int[maxDeadline + 1];
        for(Job x : arr) {
            int availableSlot = find(x.deadline);
            if(availableSlot > 0) {
                maxProfit += x.profit;
                countJobs++;
                sequence[availableSlot] = x.id;
                union(find(availableSlot - 1), availableSlot);
            }
        }
        System.out.println("No of jobs done is = " + countJobs);
        System.out.println("Maximum Profit made is = " + maxProfit);
        System.out.print("Sequence of jobs is = ");
        for(int i : sequence) {
            if(i != -1) {
                System.out.print(sequence[i] + " ");
            }
        }
    }
}
