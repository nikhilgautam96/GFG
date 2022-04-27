package String;
public class isomorphic_strings {
    public static boolean areIsomorphic(String str1,String str2) {
        if(str1.length() == str2.length()) {
            char mapping[] = new char[256];
            boolean mapped[] = new boolean[256];
            for(int i = 0; i<str1.length(); i++) {
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                if(mapping[ch1] == '\0' && mapped[ch2] == false) {
                    mapping[ch1] = ch2;
                    mapped[ch2] = true;
                }else if(mapping[ch1] != ch2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
