// For Input: 
//      timetopractice
//      ttoc

// Expected Output: 
//      topract

// Input:
//     S = "zoomlazapzo"
//     P = "oza"
// Output: 
//     apzo



package String;
public class smallest_window_containing_all_chars_of_other_string {
    public static String smallestWindow(String s, String p) {
        int pat[] = new int[26], str[] = new int[26];
        for(int i = 0; i<p.length(); i++) {
            pat[p.charAt(i)-97]++;
        }
        int min = Integer.MAX_VALUE;
        String ans = "";
        int count = 0;
        for(int i = 0, j = 0; i<s.length(); i++) {
            int x = s.charAt(i) - 97;
            str[x]++;
            if(str[x] <= pat[x]) {
                count++;
                while(j <= i && count == p.length()) {
                    int len = i-j+1;
                    if(len < min) {
                        min = len;
                        ans = s.substring(j, j+len);
                    }
                    x = s.charAt(j) - 97;
                    str[x]--;
                    if(str[x] < pat[x]) {
                        count--;
                    }
                    j++;
                }
            }
        }
        if(min == Integer.MAX_VALUE)
            return "-1";
        return ans;
    }
}
