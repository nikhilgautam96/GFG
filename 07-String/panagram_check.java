package String;
public class panagram_check {
    public static boolean checkPangram(String str) {
        boolean alpha[] = new boolean[26];
        for(int i = 0; i<str.length(); i++) {
            if(Character.isLetter(str.charAt(i)) == true) {
                int ascii = str.charAt(i);
                ascii = (ascii >= 97) ? ascii - 97 : ascii - 65;
                alpha[ascii] = true;
            }
        }
        for(int i = 0; i<26; i++) {
            if(alpha[i] == false)
                return false;
        }
        return true;
    }
}
