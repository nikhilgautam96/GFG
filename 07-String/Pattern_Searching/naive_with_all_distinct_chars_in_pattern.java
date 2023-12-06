package String.Pattern_Searching;
public class naive_with_all_distinct_chars_in_pattern {
    static boolean search(String pat, String txt) {
        // In this question intuition is that "Pattern has all distinct characters".
        int n = txt.length(), m = pat.length();
        for(int i = 0; i<n-m+1; i++) {
            int j = 0;
            for(; j<m; j++) {
                if(txt.charAt(i+j) != pat.charAt(j))
                    break;
            }
            if(j == m)
                return true;
            if(j != 0)
                i = i+j-1;
        }
        return false;
    }
}
