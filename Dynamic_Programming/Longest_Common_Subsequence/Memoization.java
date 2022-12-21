package Dynamic_Programming.Longest_Common_Subsequence;
import java.util.*;
public class Memoization {
    static int memo[][];
    static int lcs(String s1, String s2, int n, int m) {
        if(n == 0 || m == 0) {
            memo[n][m] = 0;
        } else if(memo[n][m] == -1) {
            if(s1.charAt(n-1) == s2.charAt(m-1)) {
                memo[n][m] = 1 + lcs(s1, s2, n-1, m-1);
            } else {
                memo[n][m] = Math.max(lcs(s1, s2, n-1, m), lcs(s1, s2, n, m-1));
            }
        }
        return memo[n][m];
    }
    public static void main (String[] args) {
        String s1 = "AXYZ", s2 = "BAZ";
        int n = s1.length(), m = s2.length();
        memo = new int[n+1][m+1];
        for(int i[] : memo) {
            Arrays.fill(i, -1);
        }
        System.out.println(lcs(s1, s2, n, m));
	}
}
