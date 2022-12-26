// Time : O(eggs * floor^2), Space : O(eggs * floors)
package Dynamic_Programming.Egg_Dropping_Problem;
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
                        int max = Math.max(dp[i-1][x], dp[i][y]);
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
