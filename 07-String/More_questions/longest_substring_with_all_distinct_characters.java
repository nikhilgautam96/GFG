// Naive   -  O(n^3)
// Better  -  O(n^2)
// Best    -  O(n)
package String.More_questions;
import java.util.Arrays;
public class longest_substring_with_all_distinct_characters {
    static int findLongestSubstring(String str) {
        int n = str.length();
        int i = 0, j = 0, maxLen = 0;
        int prevIndex[] = new int[256];
        Arrays.fill(prevIndex, -1);
        for( ; j<n; j++) {
            i = Math.max(i, prevIndex[str.charAt(j)] + 1);
            int len = j - i + 1;
            maxLen = Math.max(len, maxLen);
            prevIndex[str.charAt(j)] = j;
        }
        return maxLen;
    }
}
