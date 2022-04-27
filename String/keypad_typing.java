package String;
public class keypad_typing {
    public static String printNumber(String s, int n) {
        char ch[] = {'2', '2', '2', '3', '3', '3', '4', '4', '4', '5', '5', '5',
                        '6', '6', '6', '7', '7', '7', '7', '8', '8', '8', '9', '9',
                        '9', '9'};
        String ans = "";
        for(int i = 0; i<n; i++) {
            ans += ch[s.charAt(i)-97];
        }
        return ans;
    }
}
