package Searching;
import java.util.*;
public class subarray_with_given_sum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)  {
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0, left = 0;
        for(int right = 0; right < n; right++) {
            sum += arr[right];
            if(sum > s) {
                while(sum > s && left <= right) {
                    sum -= arr[left++];
                }
            }
            if(sum == s) {
                ans.add(left+1);
                ans.add(right+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
