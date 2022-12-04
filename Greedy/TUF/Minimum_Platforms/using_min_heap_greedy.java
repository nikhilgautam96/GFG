// Time : O(N * Log N), Space : O(N) - for the heap.
package Greedy.TUF.Minimum_Platforms;
import java.util.*;
public class using_min_heap_greedy {
    class TrainSchedule implements Comparable<TrainSchedule> {
        int arrivalTime, deptTime;
        TrainSchedule(int arrivalTime, int deptTime) {
            this.arrivalTime = arrivalTime; this.deptTime = deptTime;
        }
        @Override
        public int compareTo(TrainSchedule t) { return this.arrivalTime - t.arrivalTime; }
    }
    int countPlatforms(int[] arr, int[] dep) {
        TrainSchedule[] trains = new TrainSchedule[arr.length];
        for (int i = 0; i < arr.length; i++) {
            trains[i] = new TrainSchedule(arr[i], dep[i]);
        }
        // Sort trains based on arrival time
        Arrays.sort(trains);
        // A min heap to store the departure time in ascending order.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(trains[0].deptTime);
        int count = 1;
        for (int i = 1; i < trains.length; i++) {
            TrainSchedule curr = trains[i];
            // Check if arrival time of current train
            // is less than or equals to departure time of previous train
            if (curr.arrivalTime <= pq.peek()) {
                count++; // we wiil need more platforms.
            }
            else {
                // we let go the previous train and empty one platform to fit current train.
                pq.poll();
            }
            pq.add(curr.deptTime);
        }
        return count;
    }
}
