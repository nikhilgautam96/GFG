package String;
public class reverse_words_in_a_string {
    String reverseWords(String S) {
        String str[] = S.trim().split("\\.");
        String ans = "";
        for(int i = str.length - 1; i>0; i--) {
            ans += str[i] + ".";
        }
        return ans+str[0];
    }
}
