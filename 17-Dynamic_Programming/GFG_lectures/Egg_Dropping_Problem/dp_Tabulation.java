// Time : O(eggs * floor^2), Space : O(eggs * floors)
package Dynamic_Programming.GFG_lectures.Egg_Dropping_Problem;
public class dp_Tabulation {
    static int min_Attempts(int eggs, int floors) {
        int dp[][] = new int[eggs+1][floors+1];

        for(int i = 0; i<=eggs; i++) {
            for(int j = 0; j<=floors; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if(i == 1) {
                    dp[i][j] = j;
                } else if(j == 1) {
                    dp[i][j] = 1;
                } else {
                    int min = Integer.MAX_VALUE;
                    for(int x = 0, y = j-1; x<j; y--, x++) {
    // We need to find the worst case by throwing eggs from every floor from (0 to j)
    // if we throw from floor 'x' suppose, 2 possibilities
    //          1. Egg breaks => eggs|floors = (eggs-1)|(x-1)
    //          2. Egg doesnt break => eggs|floors = (eggs)|(floors-x)
    // we need to take the worst of these two cases for every floor.
                        int max = Math.max(dp[i-1][x], dp[i][y]);
                // And finally, take the best of these worst cases.
                        min = Math.min(min, max);
                    }
                    dp[i][j] = min + 1;
                }
            }
        }
        return dp[eggs][floors];
    }
    public static void main(String args[]) { 
		int eggs = 2, floors = 10; 
		System.out.print("Minimum number of "
						+ "trials in worst case with "
						+ eggs + " eggs and " + floors
						+ " floors is " + min_Attempts(eggs, floors));
	}
}
