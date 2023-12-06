// Time : O(n + m), Space : O(m).
package String.Pattern_Searching;
public class KMP_pattern_search {
    //Function to fill lps[] for given patttern pat[0..M-1]. 
    void computeLPSArray(String pat, int M, int lps[]) {
        lps[0] = 0;
        int i = 1, j = 0;
        while(i < M) {
            if(pat.charAt(i) == pat.charAt(j)) {
                lps[i] = j + 1;
                i++;
                j++;
            }else {
                if(j == 0) {
                    lps[i] = 0;
                    i++;
                }else {
                    j = lps[j-1];
                }
            }
        }
    }
    //Function to check if the pattern exists in the string or not.
    boolean KMPSearch(String pat, String txt) {
        int n = txt.length(), m = pat.length();
        int lps[] = new int[m];
        computeLPSArray(pat, m, lps);
        int i = 0, j = 0;
        while(i < n) {
            if(txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
                if(j == m)
                    return true;
            }else {
                if(j == 0) {
                    i++;
                }else {
                    j = lps[j-1];
                }
            }
        }
        return false;
    }
}
