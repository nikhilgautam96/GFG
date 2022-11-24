// Time : O(N Log N) + O(N * M), Space : O(M), where M = "Maximum Deadline"
package Greedy.lectures.Job_Sequencing_Problem;
import java.util.*;
public class Usual_Greedy_approach {
    class Job {
        int id, deadline, profit;
        Job(int id, int deadline, int profit) {
            this.id = id; this.deadline = deadline; this.profit = profit;
        }
    }
    void jobSequencing(Job arr[], int n) {
        Arrays.sort(arr, (a, b)->(b.profit - a.profit));
        int maxDeadline = 0;
        for( int i = 0; i<n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        int result[] = new int[maxDeadline + 1];
        Arrays.fill(result, -1);
        int countJobs = 0, maxProfit = 0;
        for(int i = 0; i<n; i++) {
            for(int j = arr[i].deadline; j > 0; j--) {
                if(result[j] != -1) {
                    result[j] = arr[i].id;
                    countJobs++;
                    maxProfit += arr[i].profit;
                    break;
                }
            }
        }
        System.out.println("No of jobs done is = " + countJobs);
        System.out.println("Maximum Profit made is = " + maxProfit);
        System.out.print("Sequence of jobs is = ");
        for(int i : result) {
            if(i != -1) {
                System.out.print(result[i] + " ");
            }
        }
    }
}
