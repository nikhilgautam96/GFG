package String;
public class Anagram_check {
    public static boolean isAnagram(String a,String b) {
        int c[] = new int[256];
        int n = a.length(), m = b.length();
        if(n != m)
            return false;
        for(int i = 0; i<n; i++) {
            c[a.charAt(i)]++;
            c[b.charAt(i)]--;
        }
        for(int i = 0; i<256; i++)
            if(c[i] != 0)
                return false;
        return true;
    }
}
