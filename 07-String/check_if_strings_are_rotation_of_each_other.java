package String;
public class check_if_strings_are_rotation_of_each_other {
    public static boolean areRotations(String s1, String s2 ) {
        if(s1.length() == s2.length() && (s1+s1).indexOf(s2) != -1)
            return true;
        return false;
    }
}
