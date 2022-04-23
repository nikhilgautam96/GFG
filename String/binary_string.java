// Given a binary string S. The task is to count the number of substrings that start and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.

// Example 1:

// Input:
// N = 4
// S = 1111
// Output: 6
// Explanation: There are 6 substrings from
// the given string. They are 11, 11, 11,
// 111, 111, 1111.

// ans = nC2; "where n - is number of 1's in the String."

package String;
public class binary_string {
    public static int binarySubstring(int a, String str) {
        int countOfOnes = 0;
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == '1')
                countOfOnes++;
        }
        int ans = (countOfOnes * --countOfOnes)/2;
        return ans;
    }
}
