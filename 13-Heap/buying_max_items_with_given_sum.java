package Heap;
import java.util.Arrays;
import java.util.PriorityQueue;
public class buying_max_items_with_given_sum {
    // Time : O(n) + O(res * Log n) = O(n * Log n) as it can go till N in worst case.
    public static void method2(String args[]) { 
        int n=5;
        int cost[]=new int[]{1,12,5,111,200};
        int sum=10;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        int res=0;
        for(int i=0;i<n;i++)
            pq.add(cost[i]);
        
        for(int i=0;i<n;i++) {
            if(pq.peek()<=sum) {
                sum-=pq.poll();
                res++;
            }else {
                break;
            }
        }
        System.out.print(res);
    }
    // Time : O(n * Log n)
    public static void method1(String args[]) { 
        int n=5;
        int cost[]=new int[]{1,12,5,111,200};
        int sum = 10, res=0;
        Arrays.sort(cost);
        for(int i=0;i<n;i++){
            if(cost[i]<=sum){
                sum-=cost[i];
                res++;
            }else{
                break;
            }
        }
        System.out.print(res);
    }
}
