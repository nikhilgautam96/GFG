package String;
public class check_if_string_rotated_by_two_places {
    public static boolean isRotated(String str1, String str2) {
        if(str1.length() < 2 || str2.length() < 2) {
            if(str1.equals(str2))
                return true;
            return false;
        }
        String new1 = str2.substring(str2.length()-2) + str2.substring(0, str2.length()-2);
        String new2 = str2.substring(2) + str2.substring(0, 2);
       
        if(new1.equals(str1) || new2.equals(str1))
            return true;
        return false;
    }
}
