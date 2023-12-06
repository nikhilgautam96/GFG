package String.Pattern_Searching;
public class naive_pattern_searching {
    static boolean search(String pat, String txt) {
        int n = txt.length(), m = pat.length();
        for(int i = 0; i <= n-m; i++) {
            int j = 0;
            for(; j<m; j++) {
                if(pat.charAt(j) != txt.charAt(i+j))
                    break;
            }
            if(j == m)
                return true;
        }
        return false;
    }
}
