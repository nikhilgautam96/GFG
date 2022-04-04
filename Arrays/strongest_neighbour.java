// Given an array arr[] of n positive integers. The task is to find the maximum 
// for every adjacent pairs in the array.
public class strongest_neighbour {
    static void maximumAdjacent(int sizeOfArray, int arr[]) {
        
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
         StringBuffer sb = new StringBuffer();
        for(int i = 0; i<sizeOfArray-1; i++) {
            int max = Math.max(arr[i], arr[i+1]);
            sb.append(max+" ");
        }
        System.out.print(sb);
    }
}
