package String;
public class the_modified_string {
    public static long modified(String a) {
        long count = 0;
        for(int i = 0; i<a.length(); i++) {
            int j = i;
            while(j < a.length() && a.charAt(j) == a.charAt(i)) {
                j++;
            }
            count += ((j-i)/2 - 1) + (j-i)%2;
            i = j-1;
        }
        return count;
    }
}
