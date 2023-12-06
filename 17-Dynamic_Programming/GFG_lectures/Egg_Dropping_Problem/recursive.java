// Time : O(floors * 2 ^ min(eggs, floors)), 
//      |-> Two recursive calls are made for every combination of eggs and floors. 
//          So, the total number of recursive calls is { 2 ^ min(EGGS, FLOORS) }. 
//          A loop runs in the code in linear time from 1 to ‘FLOORS’ for each recursive call

// Space : O(min(eggs, floors)),
//      |-> Since the total number of recursive calls is { 2 ^ min(EGGS, FLOORS) }.
//          The depth of the recursion tree would be min(EGGS, FLOORS). 
package Dynamic_Programming.GFG_lectures.Egg_Dropping_Problem;
public class recursive {
    static int min_Attempts(int eggs, int floors) {
        if(eggs == 0 || floors == 0) return 0;
        if(floors == 1) return 1;
        if(eggs == 1) return floors;

        int min = Integer.MAX_VALUE;
        for(int i = 1; i<=floors; i++) {
            int max = Math.max(min_Attempts(eggs-1, i-1), min_Attempts(eggs, floors-i));
            min = Math.min(min, max);
        }
        return min + 1;
    }
    public static void main(String args[]) { 
		int eggs = 2, floors = 10; 
		System.out.print("Minimum number of "
						+ "trials in worst case with "
						+ eggs + " eggs and " + floors
						+ " floors is " + min_Attempts(eggs, floors));
	}
}
