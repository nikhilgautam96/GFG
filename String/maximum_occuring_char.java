package String;
public class maximum_occuring_char {
    public static char getMaxOccuringChar(String line) {
        int freq[] = new int[256];
        for(int i = 0; i<line.length(); i++) {
            freq[line.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        char ans = '\0';
        for(int i = 255; i>=0; i--) {
            if(freq[i] >= max) {
                max = freq[i];
                ans = (char)i;
            }
        }
        return ans;
    }
}
