package String;
public class sum_of_numbers_in_string {
    public static long findSum(String str) {
        long ans = 0;
        for(int i = 0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                int j = i;
                while(j<str.length() && Character.isDigit(str.charAt(j))) {
                   j++;
                }
                long num = Integer.parseInt(str.substring(i, j));
                ans += num;
                i = j-1;
            }
        }
        return ans;
    }
}
