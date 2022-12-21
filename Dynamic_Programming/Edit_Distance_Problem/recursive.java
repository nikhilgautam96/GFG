// To convert 'S1' into 'S2', we can perform 3 operations 
//                    { 1. Delete character in S1 (length of S1 decreases), 
//                      2. Add last character of S2 to S1 (length of s1 increases), 
//                      3. Replace last character of S1 with S2 (length remains same).  }

// Time : O(3 ^ n)
// Space : O(n + m) - Since the length of S1 either increases 
//                  (in which case it can increase and become = S1 + S2), 
//                  or it decreases,
//                  or it remains same (in which case we skip the last character 
//                                     cheking thereby making a call for (n-1, m-1)).
package Dynamic_Programming.Edit_Distance_Problem;
public class recursive {
    int edit_distance(String s1, String s2, int n, int m) {
        if(n == 0)
            return m;
        if(m == 0)
            return n;
        if(s1.charAt(n-1) == s2.charAt(m-1)) {
            return edit_distance(s1, s2, n-1, m-1);
        }
        // Else -> { 1. Delete last char of S1 = (s1, s2, n-1, m)
        //           2. Add last char of S2 to S1 = (s1, s2, n, m-1)
        //           3. Replace last char of S1 with that of S2 = (s1, s2, n-1, m-1) }
        return Math.min(edit_distance(s1, s2, n-1, m), 
                    Math.min(edit_distance(s1, s2, n, m-1), edit_distance(s1, s2, n-1, m-1)));
    }
}
