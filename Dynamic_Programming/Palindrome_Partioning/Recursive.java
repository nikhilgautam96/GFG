// Time : O(2 ^ n), Space : O(n)
package Dynamic_Programming.Palindrome_Partioning;
public class Recursive {
    boolean isPalindrome(String S, int i ,int j) {
        if(i >= j) { return true; }
        if(S.charAt(i) != S.charAt(j)) {
            return false;
        }
        return isPalindrome(S, i+1, j-1);
    }
    int count_partition(String S, int i, int j) {
        if(isPalindrome(S, i, j)) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int k = i; k<j; k++) {
            res = Math.min(res, 1 + count_partition(S, i, k) + count_partition(S, k+1, j));
        }
        return res;
    }
}
