// Time : O(n), Space : O(1)
package String;
public class check_if_a_string_is_subsequence_of_other {
    public static boolean isSubSequence(String pat, String str) {
        // Iterative approach.
        // i = for str, j = for pat.
        int i = 0, j = 0;
        for( ; i<str.length(); i++) {
            if(str.charAt(i) == pat.charAt(j)) {
                j++;
                if(j == pat.length())
                    return true;
            }
        }
        return false;
    }
    // Recursive approach.
    public static boolean isSub_Recursive(String pat, String str, int m, int n) {
        if(m == 0)
            return true;
        if(n == 0)
            return false;

        if(str.charAt(n-1) == pat.charAt(m-1))
            return isSub_Recursive(pat, str, m-1, n-1);
        return isSub_Recursive(pat, str, m, n-1);
    }
}
