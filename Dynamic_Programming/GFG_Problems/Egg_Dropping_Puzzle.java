// Time : O(eggs * floor^2), Space : O(eggs * floors).
package Dynamic_Programming.GFG_Problems;
public class Egg_Dropping_Puzzle {
    static int eggDrop(int n, int k) {
        int dp[][] = new int[n+1][k+1];
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=k; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if(i == 1) {
                    dp[i][j] = j;
                } else if(j == 1) {
                    dp[i][j] = 1;
                } else {
                    int min = Integer.MAX_VALUE;
                    for(int x = 1; x<=j; x++) {
                        int max = Math.max(dp[i-1][x-1], dp[i][j-x]);
                        min = Math.min(min, max);
                    }
                    min = min + 1;
                    dp[i][j] = min;
                }
            }
        }
        return dp[n][k];
	}
}
