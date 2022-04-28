// Time : O(n) {2 traversals of input string}
// Space : O(1).

package String;
public class case_specific_sorting_of_string {
    public static String caseSort(String str) {
        int alphaLower[] = new int[26], alphaUpper[] = new int[26];
        for(int i = 0; i<str.length(); i++) {
            int ch = str.charAt(i);
            if(ch >= 97)
                alphaLower[ch-97]++;
            else
                alphaUpper[ch-65]++;
        }
        int j = 0, k = 0;
        String ans = "";
        for(int i = 0; i<str.length(); i++) {
            int ch = str.charAt(i);
            if(ch >= 97) {
                while(j<26) {
                    if(alphaLower[j] > 0)
                        break;
                    j++;
                }
                ans += (char)(97 + j);
                alphaLower[j]--;
            }
            else {
                while(k<26) {
                    if(alphaUpper[k] > 0)
                        break;
                    k++;
                }
                ans += (char)(65 + k);
                alphaUpper[k]--;
            }
        }
        return ans;
    }
}
