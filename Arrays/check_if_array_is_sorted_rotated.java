// Given an array arr[] of N distinct integers, check if this array is Sorted 
// (non-increasing or non-decreasing) and Rotated counter-clockwise. 
// Note that input array may be sorted in either increasing or decreasing order,
// then rotated.
// A sorted array is not considered as sorted and rotated, 
// i.e., there should be at least one rotation.

// also thebarray can have consecutive equal elements but not all.

// Example
// 5
// 12 13 13 15 11               true
// 5
// 12 13 13 13 12               true
// 5
// 12 12 12 12 12               false


public class check_if_array_is_sorted_rotated {
    public static boolean checkRotatedAndSorted(int arr[], int num){
        if(num <= 2) return false;
        else if(num == 3) {
            if((arr[1] > arr[0] && arr[1] > arr[2]) 
                            || (arr[1] < arr[0] && arr[1] < arr[2])) {
                return true;
            }else {
                return false;
            }
        }
        int countNature = 0;
        if(arr[0] < arr[num-1]) {
            // descending
            for(int i = 0; i < num-1; i++) {
                if(arr[i] < arr[i+1]) {
                    countNature++;
                }
            } 
        }else if(arr[0] > arr[num-1]) {
            // ascending
            for(int i = 0; i < num-1; i++) {
                if(arr[i] > arr[i+1]) {
                    countNature++;
                }
            }
        }
        
        if(countNature == 1)
            return true;
        return false;
    }
}
