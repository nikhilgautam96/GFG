package Sorting;
import java.util.Arrays;
public class triplet_with_zero_sum {
    public boolean findTriplets(int arr[] , int n) {
	    Arrays.sort(arr);
	    for(int i = n-1; i>=2; i--) {
	        int j = 0, k = i-1;
	        while(j<k) {
	            if(arr[j] + arr[k] < -arr[i]) {
	                j++;
	            }else if(arr[j] + arr[k] > -arr[i]) {
	                k--;
	            }else {
	                return true;
	            }
	        }
	    }
	    return false;
    }
}
